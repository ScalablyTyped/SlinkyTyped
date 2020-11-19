package typingsSlinky.reactMce

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type EventHandler = js.Function2[/* event */ js.Any, /* editor */ typingsSlinky.tinymce.mod.Editor, scala.Unit]
  
  type TinyMCE = slinky.core.ReactComponentClass[typingsSlinky.reactMce.mod.ReactMCEProps]
}
