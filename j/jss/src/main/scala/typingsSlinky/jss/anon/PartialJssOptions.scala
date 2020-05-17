package typingsSlinky.jss.anon

import org.scalajs.dom.raw.CharacterData
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.jss.mod.CreateGenerateIdOptions
import typingsSlinky.jss.mod.CreateGenerateId_
import typingsSlinky.jss.mod.GenerateId
import typingsSlinky.jss.mod.InsertionPoint
import typingsSlinky.jss.mod.Plugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<jss.jss.JssOptions> */
@js.native
trait PartialJssOptions extends js.Object {
  var Renderer: js.UndefOr[Instantiable] = js.native
  var createGenerateId: js.UndefOr[CreateGenerateId_] = js.native
  var id: js.UndefOr[CreateGenerateIdOptions] = js.native
  var insertionPoint: js.UndefOr[InsertionPoint] = js.native
  var plugins: js.UndefOr[js.Array[Plugin]] = js.native
}

object PartialJssOptions {
  @scala.inline
  def apply(): PartialJssOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialJssOptions]
  }
  @scala.inline
  implicit class PartialJssOptionsOps[Self <: PartialJssOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRenderer(value: Instantiable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Renderer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenderer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Renderer")(js.undefined)
        ret
    }
    @scala.inline
    def withCreateGenerateId(value: /* options */ js.UndefOr[CreateGenerateIdOptions] => GenerateId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createGenerateId")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCreateGenerateId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createGenerateId")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: CreateGenerateIdOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withInsertionPointCharacterData(value: CharacterData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertionPoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInsertionPointHTMLElement(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertionPoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInsertionPoint(value: InsertionPoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertionPoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInsertionPoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertionPoint")(js.undefined)
        ret
    }
    @scala.inline
    def withPlugins(value: js.Array[Plugin]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlugins: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins")(js.undefined)
        ret
    }
  }
  
}

