package typingsSlinky.extjs.Ext

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IXTemplate extends ITemplate {
  /** [Method] Appends the result of this template to the provided output array
  		* @param values Object
  		* @param out Object
  		* @param parent Object
  		* @returns Array The given out array.
  		*/
  @JSName("applyOut")
  var applyOut_IXTemplate: js.UndefOr[
    js.Function3[
      /* values */ js.UndefOr[js.Any], 
      /* out */ js.UndefOr[js.Any], 
      /* parent */ js.UndefOr[js.Any], 
      Array
    ]
  ] = js.native
  /** [Config Option] (String/Array) */
  var definitions: js.UndefOr[js.Any] = js.native
}

object IXTemplate {
  @scala.inline
  def apply(): IXTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IXTemplate]
  }
  @scala.inline
  implicit class IXTemplateOps[Self <: IXTemplate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplyOut(
      value: (/* values */ js.UndefOr[js.Any], /* out */ js.UndefOr[js.Any], /* parent */ js.UndefOr[js.Any]) => Array
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyOut")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutApplyOut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyOut")(js.undefined)
        ret
    }
    @scala.inline
    def withDefinitions(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("definitions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefinitions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("definitions")(js.undefined)
        ret
    }
  }
  
}

