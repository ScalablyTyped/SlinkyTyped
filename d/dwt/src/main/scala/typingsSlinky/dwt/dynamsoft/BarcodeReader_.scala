package typingsSlinky.dwt.dynamsoft

import typingsSlinky.dwt.RunTimeSetting
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BarcodeReader_ extends js.Object {
  /** 
    * Append a new template string to current runtime settings.
    * @method BarcodeReader#decode
    * @param {string} content	A JSON string that represents the content of the settings.
    * @param {number} emSettingPriority	The parameter setting mode, which decides to inherit parameters from previous template setting or overwrite previous settings and replace by new template.
    * @return {void}
    */
  def appendTplStringToRuntimeSettings(content: String, emSettingPriority: Double): Unit = js.native
  /** 
    * Read barcode from the source image.
    * @method BarcodeReader#decode
    * @param {string} source specifies the image to read on
    * @return {Promise}
    * @example
    ```javascript
    // dwtUrl: HTML5 Edition only
    reader.decode('dwt://dwt_trial_13000404/img?id=306159652&index=0&t=1502184632022').then(
    results=>{
    for(var i = 0; i < results.length; ++i){
    console.log(results[i].BarcodeText);
    // Confidence >= 30 is reliable
    console.log(results[i].LocalizationResult.ExtendedResultArray[0].Confidence);
    }
    });
    // dcsUrl
    reader.decode('dcs://dcs_trial_6110531/img?id=306159652&index=0&t=1502184632022').then(
    function(results){
    // ie6-7 does not support console.log
    var messageArr = [];
    for(var i = 0; i < results.length; ++i){
    messageArr.push(results[i].BarcodeText);
    // Confidence >= 30 is reliable
    messageArr.push(results[i].LocalizationResult.ExtendedResultArray[0].Confidence);
    }
    alert(messageArr.join(''));
    })['catch'](function(ex){
    // ie6-9 does not support '.catch(function(ex){...})'
    if(ex){alert(ex.message||ex);}
    });
    ```
    
    */
  def decode(source: String): js.Promise[_] = js.native
  /**
    * Read barcode from base64 string
    */
  def decodeBase64String(base64String: String): js.Promise[_] = js.native
  def getAllLocalizationResults(): js.Any = js.native
  def getAllParameterTemplateNames(): js.Any = js.native
  def getRuntimeSettings(): RunTimeSetting = js.native
  def initRuntimeSettingsWithString(): js.Any = js.native
  def outputSettingsToString(): js.Any = js.native
  def resetRuntimeSettings(): Unit = js.native
  def updateRuntimeSettings(setting: RunTimeSetting): Unit = js.native
}

object BarcodeReader_ {
  @scala.inline
  def apply(
    appendTplStringToRuntimeSettings: (String, Double) => Unit,
    decode: String => js.Promise[_],
    decodeBase64String: String => js.Promise[_],
    getAllLocalizationResults: () => js.Any,
    getAllParameterTemplateNames: () => js.Any,
    getRuntimeSettings: () => RunTimeSetting,
    initRuntimeSettingsWithString: () => js.Any,
    outputSettingsToString: () => js.Any,
    resetRuntimeSettings: () => Unit,
    updateRuntimeSettings: RunTimeSetting => Unit
  ): BarcodeReader_ = {
    val __obj = js.Dynamic.literal(appendTplStringToRuntimeSettings = js.Any.fromFunction2(appendTplStringToRuntimeSettings), decode = js.Any.fromFunction1(decode), decodeBase64String = js.Any.fromFunction1(decodeBase64String), getAllLocalizationResults = js.Any.fromFunction0(getAllLocalizationResults), getAllParameterTemplateNames = js.Any.fromFunction0(getAllParameterTemplateNames), getRuntimeSettings = js.Any.fromFunction0(getRuntimeSettings), initRuntimeSettingsWithString = js.Any.fromFunction0(initRuntimeSettingsWithString), outputSettingsToString = js.Any.fromFunction0(outputSettingsToString), resetRuntimeSettings = js.Any.fromFunction0(resetRuntimeSettings), updateRuntimeSettings = js.Any.fromFunction1(updateRuntimeSettings))
    __obj.asInstanceOf[BarcodeReader_]
  }
  @scala.inline
  implicit class BarcodeReader_Ops[Self <: BarcodeReader_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppendTplStringToRuntimeSettings(value: (String, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendTplStringToRuntimeSettings")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withDecode(value: String => js.Promise[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decode")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDecodeBase64String(value: String => js.Promise[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decodeBase64String")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetAllLocalizationResults(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAllLocalizationResults")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetAllParameterTemplateNames(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAllParameterTemplateNames")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetRuntimeSettings(value: () => RunTimeSetting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRuntimeSettings")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withInitRuntimeSettingsWithString(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initRuntimeSettingsWithString")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOutputSettingsToString(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputSettingsToString")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withResetRuntimeSettings(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetRuntimeSettings")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withUpdateRuntimeSettings(value: RunTimeSetting => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateRuntimeSettings")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

