package typingsSlinky.dwt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DynamsoftLib extends js.Object {
  /*ignored
    Addon_Events  Addon_Sendback_Events  AttachAndShowImage  BIO  DOM  DynamicLoadAddonFuns  DynamicWebTwain  EnumMouseButton
    Errors  Events  IntToColorStr  LS  OnGetImageByURL  OnGetImageFromServer  Path  ProgressBar  UI  Uri
    addEventListener  ajax  all  appendMessage  appendRichMessage  aryControlLoadImage  attachAddon  attachProperty
    base64  bio  cancelFrome  clearMessage  closeAll  closeProgress  colorStrToInt  config  css  currentStyle
    debug*/
  var detect: AnonSsl = js.native
  /*ignored
    detectButton  dialog  dialogShowStatus  dlgProgress  dlgRef  drawBoxBorder  drawImageWithHermite
    each  empty  endsWith
    */
  var env: AnonBChrome = js.native
  def NewOCRReadPara(): OCRReadPara = js.native
  def NewOCRZone(): OCRZone = js.native
  def NewRedaction(): Redaction = js.native
  def getScript(url: String, bAsync: Boolean, callback: js.Function0[Unit]): Unit = js.native
  /*ignored
    error  escapeHtml  escapeRegExp  extend  filter  fireEvent  fromUnicode  get  getColor  getCss
    getElDimensions  getHex  getHexColor  getHttpUrl  getLogger  getOffset  getRandom  getRealPath  getScript
    getWS  getWSUrl  getWheelDelta  globalEval  guid  hide  html5  imageControlCount  indexOf  install
    io  isArray  isBoolean  isDef  isFunction  isLocalIP  isNaN  isNull  isNumber  isObject
    isPlainObject  isString  isUndef  isUndefined  isWindow  keys  log  main  makeArray  mix
    needShowTwiceShowDialog  nil  noop  now  obj  one  page  param  parse  parseHTML  parser
    product  progressMessage  ready  removeEventListener  replaceAll  replaceControl  show  showProgress  startWS
    startWSByIP  startsWith  stopPropagation  stringify  style  support  switchEvent  tmp  toggle  trim
    type  unEscapeHtml  unparam  upperCaseFirst  urlDecode  urlEncode  utf8  win
    ...other internal ones
    */
  def hideMask(): Unit = js.native
  def showMask(): Unit = js.native
}

object DynamsoftLib {
  @scala.inline
  def apply(
    NewOCRReadPara: () => OCRReadPara,
    NewOCRZone: () => OCRZone,
    NewRedaction: () => Redaction,
    detect: AnonSsl,
    env: AnonBChrome,
    getScript: (String, Boolean, js.Function0[Unit]) => Unit,
    hideMask: () => Unit,
    showMask: () => Unit
  ): DynamsoftLib = {
    val __obj = js.Dynamic.literal(NewOCRReadPara = js.Any.fromFunction0(NewOCRReadPara), NewOCRZone = js.Any.fromFunction0(NewOCRZone), NewRedaction = js.Any.fromFunction0(NewRedaction), detect = detect.asInstanceOf[js.Any], env = env.asInstanceOf[js.Any], getScript = js.Any.fromFunction3(getScript), hideMask = js.Any.fromFunction0(hideMask), showMask = js.Any.fromFunction0(showMask))
    __obj.asInstanceOf[DynamsoftLib]
  }
  @scala.inline
  implicit class DynamsoftLibOps[Self <: DynamsoftLib] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNewOCRReadPara(value: () => OCRReadPara): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NewOCRReadPara")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewOCRZone(value: () => OCRZone): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NewOCRZone")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewRedaction(value: () => Redaction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NewRedaction")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDetect(value: AnonSsl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnv(value: AnonBChrome): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("env")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetScript(value: (String, Boolean, js.Function0[Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getScript")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withHideMask(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideMask")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withShowMask(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showMask")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

