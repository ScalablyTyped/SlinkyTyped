package typingsSlinky.athenajs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Animations = org.scalablytyped.runtime.StringDictionary[typingsSlinky.athenajs.mod.AnimationObject]
  
  @scala.inline
  def AudioManager: typingsSlinky.athenajs.mod._AudioManager = typingsSlinky.athenajs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("AudioManager").asInstanceOf[typingsSlinky.athenajs.mod._AudioManager]
  
  type Callback = js.Function1[/* repeated */ js.Any, scala.Unit]
  
  @scala.inline
  def Dom(): typingsSlinky.athenajs.mod._Dom[org.scalajs.dom.raw.HTMLElement] = typingsSlinky.athenajs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("Dom")().asInstanceOf[typingsSlinky.athenajs.mod._Dom[org.scalajs.dom.raw.HTMLElement]]
  @scala.inline
  def Dom(sel: java.lang.String): typingsSlinky.athenajs.mod._Dom[org.scalajs.dom.raw.HTMLElement] = typingsSlinky.athenajs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("Dom")(sel.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.athenajs.mod._Dom[org.scalajs.dom.raw.HTMLElement]]
  @scala.inline
  def Dom(sel: org.scalajs.dom.raw.HTMLElement): typingsSlinky.athenajs.mod._Dom[org.scalajs.dom.raw.HTMLElement] = typingsSlinky.athenajs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("Dom")(sel.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.athenajs.mod._Dom[org.scalajs.dom.raw.HTMLElement]]
  
  @scala.inline
  def FX: typingsSlinky.athenajs.mod.FXInstance = typingsSlinky.athenajs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("FX").asInstanceOf[typingsSlinky.athenajs.mod.FXInstance]
  
  @scala.inline
  def InputManager: typingsSlinky.athenajs.mod._InputManager = typingsSlinky.athenajs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("InputManager").asInstanceOf[typingsSlinky.athenajs.mod._InputManager]
  
  type JSObject = org.scalablytyped.runtime.StringDictionary[js.Any]
  
  @scala.inline
  def NotificationManager: typingsSlinky.athenajs.mod._NotificationManager = typingsSlinky.athenajs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("NotificationManager").asInstanceOf[typingsSlinky.athenajs.mod._NotificationManager]
  
  type RenderingContext = org.scalajs.dom.raw.CanvasRenderingContext2D
  
  @scala.inline
  def ResourceManager: typingsSlinky.athenajs.mod._ResourceManager = typingsSlinky.athenajs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("ResourceManager").asInstanceOf[typingsSlinky.athenajs.mod._ResourceManager]
}
