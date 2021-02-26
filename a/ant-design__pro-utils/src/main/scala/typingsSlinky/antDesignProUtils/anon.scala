package typingsSlinky.antDesignProUtils

import org.scalablytyped.runtime.StringDictionary
import slinky.core.facade.ReactElement
import typingsSlinky.antDesignProUtils.typingMod.ProCoreActionType
import typingsSlinky.antDesignProUtils.typingMod.ProFieldRequestData
import typingsSlinky.antDesignProUtils.typingMod.ProSchemaComponentTypes
import typingsSlinky.antDesignProUtils.typingMod.ProSchemaValueEnumMap
import typingsSlinky.antDesignProUtils.typingMod.ProSchemaValueEnumObj
import typingsSlinky.antd.tooltipMod.TooltipProps
import typingsSlinky.antd.useFormMod.FormInstance
import typingsSlinky.react.mod.ReactText
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Constructor extends StObject {
    
    var constructor: js.Any = js.native
  }
  object Constructor {
    
    @scala.inline
    def apply(constructor: js.Any): Constructor = {
      val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any])
      __obj.asInstanceOf[Constructor]
    }
    
    @scala.inline
    implicit class ConstructorMutableBuilder[Self <: Constructor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConstructor(value: js.Any): Self = StObject.set(x, "constructor", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DataIndex[T, U] extends StObject {
    
    /**
      * @name 与实体映射的key
      * @description 支持一个数字，[a,b] 会转化为 obj.a.b
      */
    var dataIndex: js.UndefOr[String | Double | (js.Array[String | Double])] = js.native
    
    var fieldProps: js.UndefOr[js.Any] = js.native
    
    /**
      * @name 隐藏在 descriptions
      */
    var hideInDescriptions: js.UndefOr[Boolean] = js.native
    
    /**
      * @name 确定这个列的唯一值
      */
    var key: js.UndefOr[ReactText] = js.native
    
    /**
      * @name 从服务器请求的参数，改变了会触发 reload
      */
    var params: js.UndefOr[StringDictionary[js.Any]] = js.native
    
    var render: js.UndefOr[
        js.Function5[
          /* dom */ ReactElement, 
          /* entity */ T, 
          /* index */ Double, 
          /* action */ ProCoreActionType, 
          /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias @ant-design/pro-utils.@ant-design/pro-utils/lib/typing.ProSchema<T, U, Extra> */ /* schema */ js.Object, 
          ReactElement
        ]
      ] = js.native
    
    /**
      * @name 自定义编辑模式
      * @description 返回一个node，会自动包裹 value 和 onChange
      */
    var renderFormItem: js.UndefOr[
        js.Function3[
          /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias @ant-design/pro-utils.@ant-design/pro-utils/lib/typing.ProSchema<T, U, Extra> */ /* item */ js.Object, 
          /* config */ DefaultRender, 
          /* form */ FormInstance[_], 
          ReactElement
        ]
      ] = js.native
    
    /**
      * @name 自定义 render
      * @description 必须要返回 string
      */
    var renderText: js.UndefOr[
        js.Function4[/* text */ js.Any, /* record */ T, /* index */ Double, /* action */ ProCoreActionType, _]
      ] = js.native
    
    /**
      * @name 从服务器请求枚举
      */
    var request: js.UndefOr[
        ProFieldRequestData[
          /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias @ant-design/pro-utils.@ant-design/pro-utils/lib/typing.ProSchema<unknown, string, unknown> */ js.Object, 
          _
        ]
      ] = js.native
    
    /**
      * @deprecated 你可以使用 tooltip，这个更改是为了与 antd 统一
      */
    var tip: js.UndefOr[String] = js.native
    
    /**
      * @name 标题
      * @description 支持 ReactNode 和 方法
      */
    var title: js.UndefOr[
        (js.Function3[
          /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias @ant-design/pro-utils.@ant-design/pro-utils/lib/typing.ProSchema<T, U, Extra> */ /* schema */ js.Object, 
          /* type */ ProSchemaComponentTypes, 
          /* dom */ ReactElement, 
          ReactElement
        ]) | ReactElement
      ] = js.native
    
    /**
      *@name 展示一个 icon，hover 是展示一些提示信息
      */
    var tooltip: js.UndefOr[String] = js.native
    
    /**
      * @name 映射值的类型
      */
    var valueEnum: js.UndefOr[ProSchemaValueEnumObj | ProSchemaValueEnumMap] = js.native
    
    /**
      * 选择如何渲染相应的模式
      */
    var valueType: js.UndefOr[(js.Function2[/* entity */ T, /* type */ ProSchemaComponentTypes, U]) | U] = js.native
  }
  object DataIndex {
    
    @scala.inline
    def apply[T, U](): DataIndex[T, U] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DataIndex[T, U]]
    }
    
    @scala.inline
    implicit class DataIndexMutableBuilder[Self <: DataIndex[_, _], T, U] (val x: Self with (DataIndex[T, U])) extends AnyVal {
      
      @scala.inline
      def setDataIndex(value: String | Double | (js.Array[String | Double])): Self = StObject.set(x, "dataIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataIndexUndefined: Self = StObject.set(x, "dataIndex", js.undefined)
      
      @scala.inline
      def setDataIndexVarargs(value: (String | Double)*): Self = StObject.set(x, "dataIndex", js.Array(value :_*))
      
      @scala.inline
      def setFieldProps(value: js.Any): Self = StObject.set(x, "fieldProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldPropsUndefined: Self = StObject.set(x, "fieldProps", js.undefined)
      
      @scala.inline
      def setHideInDescriptions(value: Boolean): Self = StObject.set(x, "hideInDescriptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideInDescriptionsUndefined: Self = StObject.set(x, "hideInDescriptions", js.undefined)
      
      @scala.inline
      def setKey(value: ReactText): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setParams(value: StringDictionary[js.Any]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      @scala.inline
      def setRender(
        value: (/* dom */ ReactElement, /* entity */ T, /* index */ Double, /* action */ ProCoreActionType, /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias @ant-design/pro-utils.@ant-design/pro-utils/lib/typing.ProSchema<T, U, Extra> */ /* schema */ js.Object) => ReactElement
      ): Self = StObject.set(x, "render", js.Any.fromFunction5(value))
      
      @scala.inline
      def setRenderFormItem(
        value: (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias @ant-design/pro-utils.@ant-design/pro-utils/lib/typing.ProSchema<T, U, Extra> */ /* item */ js.Object, /* config */ DefaultRender, /* form */ FormInstance[_]) => ReactElement
      ): Self = StObject.set(x, "renderFormItem", js.Any.fromFunction3(value))
      
      @scala.inline
      def setRenderFormItemUndefined: Self = StObject.set(x, "renderFormItem", js.undefined)
      
      @scala.inline
      def setRenderText(
        value: (/* text */ js.Any, /* record */ T, /* index */ Double, /* action */ ProCoreActionType) => _
      ): Self = StObject.set(x, "renderText", js.Any.fromFunction4(value))
      
      @scala.inline
      def setRenderTextUndefined: Self = StObject.set(x, "renderText", js.undefined)
      
      @scala.inline
      def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
      
      @scala.inline
      def setRequest(
        value: (_, /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias @ant-design/pro-utils.@ant-design/pro-utils/lib/typing.ProSchema<unknown, string, unknown> */ js.Object) => js.Promise[js.Array[Dictkey]]
      ): Self = StObject.set(x, "request", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
      
      @scala.inline
      def setTip(value: String): Self = StObject.set(x, "tip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTipUndefined: Self = StObject.set(x, "tip", js.undefined)
      
      @scala.inline
      def setTitle(
        value: (js.Function3[
              /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias @ant-design/pro-utils.@ant-design/pro-utils/lib/typing.ProSchema<T, U, Extra> */ /* schema */ js.Object, 
              /* type */ ProSchemaComponentTypes, 
              /* dom */ ReactElement, 
              ReactElement
            ]) | ReactElement
      ): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleFunction3(
        value: (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias @ant-design/pro-utils.@ant-design/pro-utils/lib/typing.ProSchema<T, U, Extra> */ /* schema */ js.Object, /* type */ ProSchemaComponentTypes, /* dom */ ReactElement) => ReactElement
      ): Self = StObject.set(x, "title", js.Any.fromFunction3(value))
      
      @scala.inline
      def setTitleReactElement(value: ReactElement): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setTooltip(value: String): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
      
      @scala.inline
      def setValueEnum(value: ProSchemaValueEnumObj | ProSchemaValueEnumMap): Self = StObject.set(x, "valueEnum", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueEnumUndefined: Self = StObject.set(x, "valueEnum", js.undefined)
      
      @scala.inline
      def setValueType(value: (js.Function2[/* entity */ T, /* type */ ProSchemaComponentTypes, U]) | U): Self = StObject.set(x, "valueType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueTypeFunction2(value: (/* entity */ T, /* type */ ProSchemaComponentTypes) => U): Self = StObject.set(x, "valueType", js.Any.fromFunction2(value))
      
      @scala.inline
      def setValueTypeUndefined: Self = StObject.set(x, "valueType", js.undefined)
    }
  }
  
  @js.native
  trait DefaultRender extends StObject {
    
    def defaultRender(
      newItem: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias @ant-design/pro-utils.@ant-design/pro-utils/lib/typing.ProSchema<T, U, Extra> */ js.Object
    ): ReactElement | Null = js.native
    
    var onChange: js.UndefOr[js.Function1[/* value */ js.Any, Unit]] = js.native
    
    var onSelect: js.UndefOr[js.Function1[/* value */ js.Any, Unit]] = js.native
    
    var `type`: ProSchemaComponentTypes = js.native
    
    var value: js.UndefOr[js.Any] = js.native
  }
  object DefaultRender {
    
    @scala.inline
    def apply(
      defaultRender: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias @ant-design/pro-utils.@ant-design/pro-utils/lib/typing.ProSchema<T, U, Extra> */ js.Object => ReactElement | Null
    ): DefaultRender = {
      val __obj = js.Dynamic.literal(defaultRender = js.Any.fromFunction1(defaultRender))
      __obj.asInstanceOf[DefaultRender]
    }
    
    @scala.inline
    implicit class DefaultRenderMutableBuilder[Self <: DefaultRender] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaultRender(
        value: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias @ant-design/pro-utils.@ant-design/pro-utils/lib/typing.ProSchema<T, U, Extra> */ js.Object => ReactElement | Null
      ): Self = StObject.set(x, "defaultRender", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChange(value: /* value */ js.Any => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnSelect(value: /* value */ js.Any => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      @scala.inline
      def setType(value: ProSchemaComponentTypes): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait Dictkey
    extends /* key */ StringDictionary[js.Any] {
    
    var label: ReactElement = js.native
    
    var value: ReactText = js.native
  }
  object Dictkey {
    
    @scala.inline
    def apply(value: ReactText): Dictkey = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dictkey]
    }
    
    @scala.inline
    implicit class DictkeyMutableBuilder[Self <: Dictkey] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLabel(value: ReactElement): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setValue(value: ReactText): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Id extends StObject {
    
    var id: String = js.native
    
    var pageName: String = js.native
    
    var title: String = js.native
  }
  object Id {
    
    @scala.inline
    def apply(id: String, pageName: String, title: String): Id = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], pageName = pageName.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[Id]
    }
    
    @scala.inline
    implicit class IdMutableBuilder[Self <: Id] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageName(value: String): Self = StObject.set(x, "pageName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Label extends StObject {
    
    var label: ReactElement = js.native
    
    var subTitle: js.UndefOr[ReactElement] = js.native
    
    var tooltip: js.UndefOr[String | TooltipProps] = js.native
  }
  object Label {
    
    @scala.inline
    def apply(): Label = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Label]
    }
    
    @scala.inline
    implicit class LabelMutableBuilder[Self <: Label] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLabel(value: ReactElement): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setSubTitle(value: ReactElement): Self = StObject.set(x, "subTitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubTitleReactElement(value: ReactElement): Self = StObject.set(x, "subTitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubTitleUndefined: Self = StObject.set(x, "subTitle", js.undefined)
      
      @scala.inline
      def setTooltip(value: String | TooltipProps): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    }
  }
}
