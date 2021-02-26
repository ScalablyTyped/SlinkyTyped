package typingsSlinky.powerappsComponentFramework.ComponentFramework

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Helper of Utils API interface
  */
object UtilityApi {
  
  /**
    * Options used when opening a lookup dialog.
    */
  @js.native
  trait LookupOptions extends StObject {
    
    /**
      * Whether the lookup allows more than one item to be selected.
      */
    var allowMultiSelect: Boolean = js.native
    
    /**
      * The default entity type.
      */
    var defaultEntityType: String = js.native
    
    /**
      * The default view to use.
      */
    var defaultViewId: String = js.native
    
    /**
      * The entity types to display.
      */
    var entityTypes: js.Array[String] = js.native
    
    /**
      * The views to be available in the view picker. Only System views are supported (not user views).
      */
    var viewIds: js.Array[String] = js.native
  }
  object LookupOptions {
    
    @scala.inline
    def apply(
      allowMultiSelect: Boolean,
      defaultEntityType: String,
      defaultViewId: String,
      entityTypes: js.Array[String],
      viewIds: js.Array[String]
    ): LookupOptions = {
      val __obj = js.Dynamic.literal(allowMultiSelect = allowMultiSelect.asInstanceOf[js.Any], defaultEntityType = defaultEntityType.asInstanceOf[js.Any], defaultViewId = defaultViewId.asInstanceOf[js.Any], entityTypes = entityTypes.asInstanceOf[js.Any], viewIds = viewIds.asInstanceOf[js.Any])
      __obj.asInstanceOf[LookupOptions]
    }
    
    @scala.inline
    implicit class LookupOptionsMutableBuilder[Self <: LookupOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowMultiSelect(value: Boolean): Self = StObject.set(x, "allowMultiSelect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultEntityType(value: String): Self = StObject.set(x, "defaultEntityType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultViewId(value: String): Self = StObject.set(x, "defaultViewId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEntityTypes(value: js.Array[String]): Self = StObject.set(x, "entityTypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEntityTypesVarargs(value: String*): Self = StObject.set(x, "entityTypes", js.Array(value :_*))
      
      @scala.inline
      def setViewIds(value: js.Array[String]): Self = StObject.set(x, "viewIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewIdsVarargs(value: String*): Self = StObject.set(x, "viewIds", js.Array(value :_*))
    }
  }
}
