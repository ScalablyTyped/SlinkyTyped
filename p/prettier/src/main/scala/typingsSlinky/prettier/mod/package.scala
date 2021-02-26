package typingsSlinky.prettier

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type AST = js.Any
  
  type BuiltInParser = js.Function2[
    /* text */ java.lang.String, 
    /* options */ js.UndefOr[js.Any], 
    typingsSlinky.prettier.mod.AST
  ]
  
  type CustomParser = js.Function3[
    /* text */ java.lang.String, 
    /* parsers */ typingsSlinky.prettier.mod.BuiltInParsers, 
    /* options */ typingsSlinky.prettier.mod.Options, 
    typingsSlinky.prettier.mod.AST
  ]
  
  type Doc_ = typingsSlinky.prettier.mod.doc.builders.Doc
  
  type LiteralUnion[T /* <: U */, U] = T | ((typingsSlinky.std.Pick[U, scala.Nothing]) with typingsSlinky.prettier.anon._empty)
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.prettier.mod.IntSupportOption
    - typingsSlinky.prettier.mod.IntArraySupportOption
    - typingsSlinky.prettier.mod.BooleanSupportOption
    - typingsSlinky.prettier.mod.BooleanArraySupportOption
    - typingsSlinky.prettier.mod.ChoiceSupportOption[js.Any]
    - typingsSlinky.prettier.mod.PathSupportOption
    - typingsSlinky.prettier.mod.PathArraySupportOption
  */
  type SupportOption = typingsSlinky.prettier.mod._SupportOption | typingsSlinky.prettier.mod.ChoiceSupportOption[js.Any]
  
  type SupportOptions = typingsSlinky.std.Record[java.lang.String, typingsSlinky.prettier.mod.SupportOption]
  
  @scala.inline
  def check(source: java.lang.String): scala.Boolean = typingsSlinky.prettier.mod.^.asInstanceOf[js.Dynamic].applyDynamic("check")(source.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  @scala.inline
  def check(source: java.lang.String, options: typingsSlinky.prettier.mod.Options): scala.Boolean = (typingsSlinky.prettier.mod.^.asInstanceOf[js.Dynamic].applyDynamic("check")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def clearConfigCache(): scala.Unit = typingsSlinky.prettier.mod.^.asInstanceOf[js.Dynamic].applyDynamic("clearConfigCache")().asInstanceOf[scala.Unit]
  
  @scala.inline
  def format(source: java.lang.String): java.lang.String = typingsSlinky.prettier.mod.^.asInstanceOf[js.Dynamic].applyDynamic("format")(source.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  @scala.inline
  def format(source: java.lang.String, options: typingsSlinky.prettier.mod.Options): java.lang.String = (typingsSlinky.prettier.mod.^.asInstanceOf[js.Dynamic].applyDynamic("format")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  @scala.inline
  def formatWithCursor(source: java.lang.String, options: typingsSlinky.prettier.mod.CursorOptions): typingsSlinky.prettier.mod.CursorResult = (typingsSlinky.prettier.mod.^.asInstanceOf[js.Dynamic].applyDynamic("formatWithCursor")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.prettier.mod.CursorResult]
  
  @scala.inline
  def getSupportInfo(): typingsSlinky.prettier.mod.SupportInfo = typingsSlinky.prettier.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getSupportInfo")().asInstanceOf[typingsSlinky.prettier.mod.SupportInfo]
  
  @scala.inline
  def version: java.lang.String = typingsSlinky.prettier.mod.^.asInstanceOf[js.Dynamic].selectDynamic("version").asInstanceOf[java.lang.String]
}
