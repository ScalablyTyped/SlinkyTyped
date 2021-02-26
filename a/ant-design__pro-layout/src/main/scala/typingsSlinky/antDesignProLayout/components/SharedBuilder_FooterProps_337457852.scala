package typingsSlinky.antDesignProLayout.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antDesignProLayout.anon.BlankTarget
import typingsSlinky.antDesignProLayout.typingsMod.WithFalse
import typingsSlinky.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
class SharedBuilder_FooterProps_337457852 (val args: js.Array[js.Any])
  extends AnyVal
     with StBuildingComponent[tag.type, scala.Nothing] {
  
  @scala.inline
  def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  
  @scala.inline
  def copyright(value: WithFalse[String]): this.type = set("copyright", value.asInstanceOf[js.Any])
  
  @scala.inline
  def links(value: WithFalse[js.Array[BlankTarget]]): this.type = set("links", value.asInstanceOf[js.Any])
  
  @scala.inline
  def linksVarargs(value: BlankTarget*): this.type = set("links", js.Array(value :_*))
  
  @scala.inline
  def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
}
