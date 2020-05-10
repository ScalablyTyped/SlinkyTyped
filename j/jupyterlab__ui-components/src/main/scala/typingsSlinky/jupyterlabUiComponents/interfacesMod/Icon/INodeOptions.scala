package typingsSlinky.jupyterlabUiComponents.interfacesMod.Icon

import typingsSlinky.jupyterlabUiComponents.styleIconMod.IIconStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options used when creating an icon node
  */
@js.native
trait INodeOptions extends IIconStyle {
  /**
    * Extra classNames, used in addition to the typestyle className
    */
  var className: js.UndefOr[String] = js.native
  /**
    * If true, if icon name resolution fails, fallback to old
    * icon handling behavior.
    *
    * TODO: remove in Jlab 2.0
    */
  var fallback: js.UndefOr[Boolean] = js.native
  /**
    * The icon name. For a 'foo-bar.svg' file, the icon name is 'foo-bar'.
    * For backwards compatibility, 'jp-FooBarIcon' is also a valid icon name.
    *
    * TODO: until Jlab 2.0
    * If fallback is set, the name is added to the className
    * of the resulting icon node
    */
  var name: String = js.native
  /**
    * Icon title
    */
  var title: js.UndefOr[String] = js.native
}

object INodeOptions {
  @scala.inline
  def apply(name: String): INodeOptions = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[INodeOptions]
  }
  @scala.inline
  implicit class INodeOptionsOps[Self <: INodeOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withFallback(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallback")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
  }
  
}

