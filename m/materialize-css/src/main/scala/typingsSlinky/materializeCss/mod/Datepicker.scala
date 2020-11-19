package typingsSlinky.materializeCss.mod

import org.scalajs.dom.raw.Element
import typingsSlinky.materializeCss.anon.PartialDatepickerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("materialize-css", "Datepicker")
@js.native
class Datepicker ()
  extends typingsSlinky.materializeCss.M.Datepicker
/* static members */
@JSImport("materialize-css", "Datepicker")
@js.native
object Datepicker extends js.Object {
  
  /**
    * Get Instance
    */
  def getInstance(elem: Element): typingsSlinky.materializeCss.M.Datepicker = js.native
  
  /**
    * Init Datepickers
    */
  def init(
    els: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MElements */ js.Any
  ): js.Array[typingsSlinky.materializeCss.M.Datepicker] = js.native
  def init(
    els: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MElements */ js.Any,
    options: PartialDatepickerOptions
  ): js.Array[typingsSlinky.materializeCss.M.Datepicker] = js.native
  /**
    * Init Datepicker
    */
  def init(els: Element): typingsSlinky.materializeCss.M.Datepicker = js.native
  def init(els: Element, options: PartialDatepickerOptions): typingsSlinky.materializeCss.M.Datepicker = js.native
}
