package typingsSlinky.reflexbox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type BoxType = typingsSlinky.emotionStyledBase.mod.StyledComponent[
    typingsSlinky.react.mod.DetailedHTMLProps[
      typingsSlinky.react.mod.HTMLAttributes[org.scalajs.dom.raw.HTMLDivElement], 
      org.scalajs.dom.raw.HTMLDivElement
    ], 
    typingsSlinky.emotionStyledBase.helperMod.Omit[
      (typingsSlinky.react.mod.DetailedHTMLProps[
        typingsSlinky.react.mod.HTMLAttributes[org.scalajs.dom.raw.HTMLDivElement], 
        org.scalajs.dom.raw.HTMLDivElement
      ]) with typingsSlinky.reflexbox.mod.BoxProps, 
      /* keyof react.react.ClassAttributes<any> */ typingsSlinky.reflexbox.reflexboxStrings.ref | typingsSlinky.reflexbox.reflexboxStrings.key
    ], 
    js.Object
  ]
}
