package typingsSlinky.babelTypes.mod

import typingsSlinky.babelTypes.babelTypesStrings.Variance
import typingsSlinky.babelTypes.babelTypesStrings.minus
import typingsSlinky.babelTypes.babelTypesStrings.plus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.babelTypes.mod.Node because Already inherited */ @js.native
trait Variance_
  extends Flow
     with BaseNode {
  var kind: minus | plus = js.native
  @JSName("type")
  var type_Variance_ : Variance = js.native
}

object Variance_ {
  @scala.inline
  def apply(kind: minus | plus, `type`: Variance): Variance_ = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Variance_]
  }
  @scala.inline
  implicit class Variance_Ops[Self <: Variance_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKind(value: minus | plus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: Variance): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

