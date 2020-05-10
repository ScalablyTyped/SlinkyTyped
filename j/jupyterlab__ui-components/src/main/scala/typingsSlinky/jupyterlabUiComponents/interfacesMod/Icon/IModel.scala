package typingsSlinky.jupyterlabUiComponents.interfacesMod.Icon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A representation of the resources underlying an inline svg icon
  */
@js.native
trait IModel extends js.Object {
  /**
    * Manually set the className corresponding to the icon name. By default,
    * the className is generated from the name: 'foo-bar' -> 'jp-FooBarIcon'
    */
  var className: js.UndefOr[String] = js.native
  /**
    * The icon name. For a 'foo-bar.svg' file, the icon name is 'foo-bar'.
    */
  var name: String = js.native
  /**
    * A string containing the html corresponding to an SVG element
    */
  var svg: String = js.native
}

object IModel {
  @scala.inline
  def apply(name: String, svg: String): IModel = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], svg = svg.asInstanceOf[js.Any])
    __obj.asInstanceOf[IModel]
  }
  @scala.inline
  implicit class IModelOps[Self <: IModel] (val x: Self) extends AnyVal {
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
    def withSvg(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("svg")(value.asInstanceOf[js.Any])
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
  }
  
}

