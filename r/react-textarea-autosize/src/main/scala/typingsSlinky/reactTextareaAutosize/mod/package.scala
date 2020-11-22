package typingsSlinky.reactTextareaAutosize

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Style = (typingsSlinky.std.Omit[
    typingsSlinky.std.NonNullable[js.UndefOr[typingsSlinky.react.mod.CSSProperties]], 
    typingsSlinky.reactTextareaAutosize.reactTextareaAutosizeStrings.maxHeight | typingsSlinky.reactTextareaAutosize.reactTextareaAutosizeStrings.minHeight
  ]) with typingsSlinky.reactTextareaAutosize.anon.Height
  
  type TextareaProps = typingsSlinky.react.mod.TextareaHTMLAttributes[org.scalajs.dom.raw.HTMLTextAreaElement]
}
