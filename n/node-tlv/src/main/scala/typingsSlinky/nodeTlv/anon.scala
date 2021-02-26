package typingsSlinky.nodeTlv

import typingsSlinky.nodeTlv.nodeTlvStrings.`context specific`
import typingsSlinky.nodeTlv.nodeTlvStrings.`private`
import typingsSlinky.nodeTlv.nodeTlvStrings.application
import typingsSlinky.nodeTlv.nodeTlvStrings.constructed
import typingsSlinky.nodeTlv.nodeTlvStrings.primitive
import typingsSlinky.nodeTlv.nodeTlvStrings.universal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Clazz extends StObject {
    
    var clazz: js.UndefOr[universal | application | (`context specific`) | `private`] = js.native
    
    var encoding: primitive | constructed = js.native
  }
  object Clazz {
    
    @scala.inline
    def apply(encoding: primitive | constructed): Clazz = {
      val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any])
      __obj.asInstanceOf[Clazz]
    }
    
    @scala.inline
    implicit class ClazzMutableBuilder[Self <: Clazz] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClazz(value: universal | application | (`context specific`) | `private`): Self = StObject.set(x, "clazz", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClazzUndefined: Self = StObject.set(x, "clazz", js.undefined)
      
      @scala.inline
      def setEncoding(value: primitive | constructed): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    }
  }
}
