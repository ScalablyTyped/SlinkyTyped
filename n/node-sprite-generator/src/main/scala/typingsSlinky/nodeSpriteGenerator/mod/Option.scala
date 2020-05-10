package typingsSlinky.nodeSpriteGenerator.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Option extends js.Object {
  var compositor: js.UndefOr[BuiltinCompositors | Compositor] = js.native
  var compositorOptions: js.UndefOr[CompositorOption] = js.native
  var layout: js.UndefOr[BuiltinLayouts | LayoutFunc] = js.native
  var layoutOptions: js.UndefOr[LayoutOption] = js.native
  var spritePath: js.UndefOr[String] = js.native
  var src: js.UndefOr[js.Array[String]] = js.native
  var stylesheet: js.UndefOr[BuiltinStylesheetFormats | StylesheetFunc | String] = js.native
  var stylesheetOptions: js.UndefOr[StylesheetOption] = js.native
  var stylesheetPath: js.UndefOr[String] = js.native
}

object Option {
  @scala.inline
  def apply(): Option = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Option]
  }
  @scala.inline
  implicit class OptionOps[Self <: Option] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompositor(value: BuiltinCompositors | Compositor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compositor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompositor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compositor")(js.undefined)
        ret
    }
    @scala.inline
    def withCompositorOptions(value: CompositorOption): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compositorOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompositorOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compositorOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withLayoutFunction3(
      value: (/* images */ js.Array[Image], /* options */ LayoutOption, /* callback */ js.Function2[/* error */ js.Error, /* layout */ Layout, Unit]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withLayout(value: BuiltinLayouts | LayoutFunc): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout")(js.undefined)
        ret
    }
    @scala.inline
    def withLayoutOptions(value: LayoutOption): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layoutOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayoutOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layoutOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withSpritePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spritePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpritePath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spritePath")(js.undefined)
        ret
    }
    @scala.inline
    def withSrc(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("src")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSrc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("src")(js.undefined)
        ret
    }
    @scala.inline
    def withStylesheetFunction5(
      value: (/* layout */ Layout, /* stylesheetPath */ String, /* spritePath */ String, /* options */ StylesheetOption, /* callback */ js.Function1[/* error */ js.Error, Unit]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stylesheet")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withStylesheet(value: BuiltinStylesheetFormats | StylesheetFunc | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stylesheet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStylesheet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stylesheet")(js.undefined)
        ret
    }
    @scala.inline
    def withStylesheetOptions(value: StylesheetOption): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stylesheetOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStylesheetOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stylesheetOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withStylesheetPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stylesheetPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStylesheetPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stylesheetPath")(js.undefined)
        ret
    }
  }
  
}

