package typingsSlinky.classnames

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.classnames.anon.Default
import typingsSlinky.classnames.typesMod.ClassNamesFn
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bindMod extends Shortcut {
  
  @JSImport("classnames/bind", JSImport.Namespace)
  @js.native
  val ^ : ClassNamesBindExport = js.native
  
  @js.native
  trait ClassNamesBind extends ClassNamesFn {
    
    def bind(styles: Record[String, String]): ClassNamesFn = js.native
  }
  
  type ClassNamesBindExport = ClassNamesBind with Default
  
  type _To = ClassNamesBindExport
  
  /* This means you don't have to write `^`, but can instead just say `bindMod.foo` */
  override def _to: ClassNamesBindExport = ^
}
