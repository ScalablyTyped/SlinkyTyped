package typingsSlinky.awsSdkClientXrayNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesAliasMod {
  
  @js.native
  trait Alias extends StObject {
    
    /**
      * <p>The canonical name of the alias.</p>
      */
    var Name: js.UndefOr[String] = js.native
    
    /**
      * <p>A list of names for the alias, including the canonical name.</p>
      */
    var Names: js.UndefOr[js.Array[String] | js.Iterable[String]] = js.native
    
    /**
      * <p>The type of the alias.</p>
      */
    var Type: js.UndefOr[String] = js.native
  }
  object Alias {
    
    @scala.inline
    def apply(): Alias = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Alias]
    }
    
    @scala.inline
    implicit class AliasMutableBuilder[Self <: Alias] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
      
      @scala.inline
      def setNames(value: js.Array[String] | js.Iterable[String]): Self = StObject.set(x, "Names", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamesIterable(value: js.Iterable[String]): Self = StObject.set(x, "Names", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamesUndefined: Self = StObject.set(x, "Names", js.undefined)
      
      @scala.inline
      def setNamesVarargs(value: String*): Self = StObject.set(x, "Names", js.Array(value :_*))
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    }
  }
  
  @js.native
  trait UnmarshalledAlias extends Alias {
    
    /**
      * <p>A list of names for the alias, including the canonical name.</p>
      */
    @JSName("Names")
    var Names_UnmarshalledAlias: js.UndefOr[js.Array[String]] = js.native
  }
  object UnmarshalledAlias {
    
    @scala.inline
    def apply(): UnmarshalledAlias = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledAlias]
    }
    
    @scala.inline
    implicit class UnmarshalledAliasMutableBuilder[Self <: UnmarshalledAlias] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNames(value: js.Array[String]): Self = StObject.set(x, "Names", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamesUndefined: Self = StObject.set(x, "Names", js.undefined)
      
      @scala.inline
      def setNamesVarargs(value: String*): Self = StObject.set(x, "Names", js.Array(value :_*))
    }
  }
}
