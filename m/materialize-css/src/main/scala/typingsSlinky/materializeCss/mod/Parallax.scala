package typingsSlinky.materializeCss.mod

import org.scalajs.dom.raw.Element
import typingsSlinky.materializeCss.anon.PartialParallaxOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Component<ParallaxOptions> * / any */ @JSImport("materialize-css", "Parallax")
@js.native
class Parallax () extends js.Object

/* static members */
@JSImport("materialize-css", "Parallax")
@js.native
object Parallax extends js.Object {
  /**
    * Get Instance
    */
  def getInstance(elem: Element): typingsSlinky.materializeCss.M.Parallax = js.native
  /**
    * Init Parallaxs
    */
  def init(
    els: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MElements */ js.Any
  ): js.Array[typingsSlinky.materializeCss.M.Parallax] = js.native
  def init(
    els: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MElements */ js.Any,
    options: PartialParallaxOptions
  ): js.Array[typingsSlinky.materializeCss.M.Parallax] = js.native
  /**
    * Init Parallax
    */
  def init(els: Element): typingsSlinky.materializeCss.M.Parallax = js.native
  def init(els: Element, options: PartialParallaxOptions): typingsSlinky.materializeCss.M.Parallax = js.native
}

