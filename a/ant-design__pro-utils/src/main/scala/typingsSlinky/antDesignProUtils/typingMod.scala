package typingsSlinky.antDesignProUtils

import org.scalablytyped.runtime.StringDictionary
import slinky.core.facade.ReactElement
import typingsSlinky.antDesignProUtils.anon.DataIndex
import typingsSlinky.antDesignProUtils.anon.Dictkey
import typingsSlinky.react.mod.ReactText
import typingsSlinky.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingMod {
  
  @js.native
  trait ProCoreActionType extends StObject {
    
    /**
      * @name 清空选择
      */
    var clearSelected: js.UndefOr[js.Function0[Unit]] = js.native
    
    /**
      * @name 刷新
      */
    def reload(): Unit = js.native
    def reload(resetPageIndex: Boolean): Unit = js.native
    
    /**
      * @name 刷新并清空
      */
    var reloadAndRest: js.UndefOr[js.Function0[Unit]] = js.native
    
    /**
      * @name 重置
      */
    var reset: js.UndefOr[js.Function0[Unit]] = js.native
  }
  
  type ProFieldRequestData[T, U] = js.Function2[/* params */ U, /* props */ T, js.Promise[js.Array[Dictkey]]]
  
  type ProSchema[T, U, Extra] = (DataIndex[T, U]) with Extra
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.antDesignProUtils.antDesignProUtilsStrings.form
    - typingsSlinky.antDesignProUtils.antDesignProUtilsStrings.list
    - typingsSlinky.antDesignProUtils.antDesignProUtilsStrings.descriptions
    - typingsSlinky.antDesignProUtils.antDesignProUtilsStrings.table
    - typingsSlinky.antDesignProUtils.antDesignProUtilsStrings.cardList
    - js.UndefOr[scala.Nothing]
  */
  type ProSchemaComponentTypes = js.UndefOr[_ProSchemaComponentTypes]
  
  type ProSchemaValueEnumMap = Map[ReactText, ProSchemaValueEnumType | ReactElement]
  
  type ProSchemaValueEnumObj = StringDictionary[ProSchemaValueEnumType | ReactElement]
  
  @js.native
  trait ProSchemaValueEnumType extends StObject {
    
    /**
      * @name 自定义的颜色
      */
    var color: js.UndefOr[String] = js.native
    
    /**
      * @name 是否禁用
      */
    var disabled: js.UndefOr[Boolean] = js.native
    
    /**
      * @name 预定的颜色
      */
    var status: String = js.native
    
    /**
      * @name 演示的文案
      */
    var text: ReactElement = js.native
  }
  object ProSchemaValueEnumType {
    
    @scala.inline
    def apply(status: String): ProSchemaValueEnumType = {
      val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProSchemaValueEnumType]
    }
    
    @scala.inline
    implicit class ProSchemaValueEnumTypeMutableBuilder[Self <: ProSchemaValueEnumType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setText(value: ReactElement): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
  
  type SearchTransformKeyFn = js.Function3[
    /* value */ js.Any, 
    /* field */ String, 
    /* object */ js.Any, 
    String | StringDictionary[js.Any]
  ]
  
  trait _ProSchemaComponentTypes extends StObject
}
