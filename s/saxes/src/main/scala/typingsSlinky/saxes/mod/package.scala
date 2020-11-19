package typingsSlinky.saxes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type AttributeHandler[O] = js.Function1[/* attribute */ typingsSlinky.saxes.mod.AttributeEventForOptions[O], scala.Unit]
  
  type CDataHandler = js.Function1[/* cdata */ java.lang.String, scala.Unit]
  
  type CloseTagHandler[O] = js.Function1[/* tag */ typingsSlinky.saxes.mod.TagForOptions[O], scala.Unit]
  
  type CommentHandler = js.Function1[/* comment */ java.lang.String, scala.Unit]
  
  type DoctypeHandler = js.Function1[/* doctype */ java.lang.String, scala.Unit]
  
  type EndHandler = js.Function0[scala.Unit]
  
  type ErrorHandler = js.Function1[/* err */ js.Error, scala.Unit]
  
  type EventNameToHandler[O, N /* <: typingsSlinky.saxes.mod.EventName */] = /* import warning: importer.ImportType#apply Failed type conversion: saxes.anon.Attribute<O>[N] */ js.Any
  
  type OpenTagHandler[O] = js.Function1[/* tag */ typingsSlinky.saxes.mod.TagForOptions[O], scala.Unit]
  
  type OpenTagStartHandler[O] = js.Function1[/* tag */ typingsSlinky.saxes.mod.StartTagForOptions[O], scala.Unit]
  
  type PIHandler = js.Function1[/* data */ typingsSlinky.saxes.anon.Body, scala.Unit]
  
  type ReadyHandler = js.Function0[scala.Unit]
  
  type ResolvePrefix = js.Function1[/* prefix */ java.lang.String, js.UndefOr[java.lang.String]]
  
  type SaxesOptions = typingsSlinky.saxes.mod.CommonOptions with typingsSlinky.saxes.mod.NSOptions with typingsSlinky.saxes.mod.XMLVersionOptions
  
  type TextHandler = js.Function1[/* text */ java.lang.String, scala.Unit]
  
  type XMLDeclHandler = js.Function1[/* decl */ typingsSlinky.saxes.mod.XMLDecl, scala.Unit]
}
