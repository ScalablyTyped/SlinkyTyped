package typingsSlinky.clownface.mod

import typingsSlinky.clownface.anon.ToString
import typingsSlinky.clownface.clownfaceStrings.BlankNode
import typingsSlinky.clownface.clownfaceStrings.Literal
import typingsSlinky.clownface.clownfaceStrings.NamedNode
import typingsSlinky.rdfJs.mod.Term
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeOptions extends js.Object {
  var datatype: js.UndefOr[Term | ToString] = js.native
  var language: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[BlankNode | Literal | NamedNode] = js.native
}

object NodeOptions {
  @scala.inline
  def apply(): NodeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeOptions]
  }
  @scala.inline
  implicit class NodeOptionsOps[Self <: NodeOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDatatype(value: Term | ToString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datatype")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDatatype: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datatype")(js.undefined)
        ret
    }
    @scala.inline
    def withLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: BlankNode | Literal | NamedNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

