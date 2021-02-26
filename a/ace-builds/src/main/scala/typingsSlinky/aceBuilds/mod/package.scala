package typingsSlinky.aceBuilds

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  @scala.inline
  def config: typingsSlinky.aceBuilds.mod.Ace.Config = typingsSlinky.aceBuilds.mod.^.asInstanceOf[js.Dynamic].selectDynamic("config").asInstanceOf[typingsSlinky.aceBuilds.mod.Ace.Config]
  
  @scala.inline
  def createEditSession(text: java.lang.String, mode: typingsSlinky.aceBuilds.mod.Ace.SyntaxMode): typingsSlinky.aceBuilds.mod.Ace.EditSession = (typingsSlinky.aceBuilds.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createEditSession")(text.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.aceBuilds.mod.Ace.EditSession]
  @scala.inline
  def createEditSession(text: typingsSlinky.aceBuilds.mod.Ace.Document, mode: typingsSlinky.aceBuilds.mod.Ace.SyntaxMode): typingsSlinky.aceBuilds.mod.Ace.EditSession = (typingsSlinky.aceBuilds.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createEditSession")(text.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.aceBuilds.mod.Ace.EditSession]
  
  @scala.inline
  def edit(el: java.lang.String): typingsSlinky.aceBuilds.mod.Ace.Editor = typingsSlinky.aceBuilds.mod.^.asInstanceOf[js.Dynamic].applyDynamic("edit")(el.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.aceBuilds.mod.Ace.Editor]
  @scala.inline
  def edit(el: java.lang.String, options: typingsSlinky.aceBuilds.anon.PartialEditorOptions): typingsSlinky.aceBuilds.mod.Ace.Editor = (typingsSlinky.aceBuilds.mod.^.asInstanceOf[js.Dynamic].applyDynamic("edit")(el.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.aceBuilds.mod.Ace.Editor]
  @scala.inline
  def edit(el: org.scalajs.dom.raw.Element): typingsSlinky.aceBuilds.mod.Ace.Editor = typingsSlinky.aceBuilds.mod.^.asInstanceOf[js.Dynamic].applyDynamic("edit")(el.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.aceBuilds.mod.Ace.Editor]
  @scala.inline
  def edit(el: org.scalajs.dom.raw.Element, options: typingsSlinky.aceBuilds.anon.PartialEditorOptions): typingsSlinky.aceBuilds.mod.Ace.Editor = (typingsSlinky.aceBuilds.mod.^.asInstanceOf[js.Dynamic].applyDynamic("edit")(el.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.aceBuilds.mod.Ace.Editor]
  
  @scala.inline
  def require(name: java.lang.String): js.Any = typingsSlinky.aceBuilds.mod.^.asInstanceOf[js.Dynamic].applyDynamic("require")(name.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def version: java.lang.String = typingsSlinky.aceBuilds.mod.^.asInstanceOf[js.Dynamic].selectDynamic("version").asInstanceOf[java.lang.String]
}
