package typingsSlinky.dwt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MBC extends js.Object {
  /**
    * Tell this painter the directory where you place`cv-wasm.js` and`cv-wasm.wasm`.
    
    * Syntax:* `MBC.cvFolder = 'js';`
    */
  var cvFolder: String = js.native
  /**
    * You should call`MBC.loadCvScriptAsync()` first before use`Free Transform` and`Brush` module.
    
    * Syntax:* `MBC.loadCvScriptAsync(callback)`
    
    | parameter | type | description |
    |  |  |  |
    | callback | `function(boolean bSuccess)` | |
    
    @example
  ```javascript
  MBC.loadCvScriptAsync(function(bSuccess){
    if(bSuccess){
    console.log('load cv script success.');
    painter.enterFreeTransformModeAsync();
    }else{
    console.log('load cv script fail.');
    }
  });
  ```
    */
  def loadCvScriptAsync(): Unit = js.native
}

object MBC {
  @scala.inline
  def apply(cvFolder: String, loadCvScriptAsync: () => Unit): MBC = {
    val __obj = js.Dynamic.literal(cvFolder = cvFolder.asInstanceOf[js.Any], loadCvScriptAsync = js.Any.fromFunction0(loadCvScriptAsync))
    __obj.asInstanceOf[MBC]
  }
  @scala.inline
  implicit class MBCOps[Self <: MBC] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCvFolder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cvFolder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoadCvScriptAsync(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadCvScriptAsync")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

