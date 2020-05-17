package typingsSlinky.baiduApp.swan

import typingsSlinky.baiduApp.anon.PartialLifetimes
import typingsSlinky.baiduApp.anon.PartialPageLifetimes
import typingsSlinky.baiduApp.anon.PartialaddGlobalClassbool
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * Component组件参数
	 */
/* Inlined parent std.Partial<baidu-app.swan.Lifetimes> */
@js.native
trait ComponentOptions[Instance /* <: Component[Data, Props] */, Data, Methods, Props] extends js.Object {
  var attached: js.UndefOr[js.Function0[Unit]] = js.native
  /**
  		 * 类似于mixins和traits的组件间代码复用机制
  		 * 参见 [behaviors](https://smartprogram.baidu.com/docs/develop/framework/custom-component_behaviors/)
  		 */
  var behaviors: js.UndefOr[
    js.Array[
      (ComponentOptions[
        Component[js.Object, js.Object], 
        DefaultData[Component[js.Object, js.Object]], 
        DefaultMethods[Component[js.Object, js.Object]], 
        PropsDefinition[DefaultProps]
      ]) | String
    ]
  ] = js.native
  var created: js.UndefOr[js.Function0[Unit]] = js.native
  /**
  		 * 组件的内部数据，和 properties 一同用于组件的模版渲染
  		 */
  var data: js.UndefOr[Data] = js.native
  var detached: js.UndefOr[js.Function0[Unit]] = js.native
  /**
  		 * 组件接受的外部样式类，参见 外部样式类
  		 *
  		 * 有时，组件希望接受外部传入的样式类（类似于 view 组件的 hover-class 属性）。
  		 * 此时可以在 Component 中用 externalClasses 定义段定义若干个外部样式类。这个特性从小程序基础库版本 1.9.90 开始支持。
  		 *
  		 * @version 1.9.90
  		 */
  var externalClasses: js.UndefOr[js.Array[String]] = js.native
  /**
  		 * 组件生命周期声明对象，组件的生命周期：created、attached、ready、moved、detached将收归到lifetimes字段内进行声明，
  		 * 原有声明方式仍旧有效，如同时存在两种声明方式，则lifetimes字段内声明方式优先级最高
  		 */
  var lifetimes: js.UndefOr[PartialLifetimes] = js.native
  /**
  		 * 组件的方法，包括事件响应函数和任意的自定义方法
  		 * 关于事件响应函数的使用
  		 * 参见[组件事件](https://smartprogram.baidu.com/docs/develop/framework/custom-component_cont/)
  		 */
  var methods: js.UndefOr[Methods] = js.native
  var moved: js.UndefOr[js.Function0[Unit]] = js.native
  /**
  		 * 一些组件选项，请参见文档其他部分的说明
  		 */
  var options: js.UndefOr[PartialaddGlobalClassbool] = js.native
  /**
  		 * 组件所在页面的生命周期声明对象，目前仅支持页面的show和hide两个生命周期
  		 */
  var pageLifetimes: js.UndefOr[PartialPageLifetimes] = js.native
  /**
  		 * 组件的对外属性，是属性名到属性设置的映射表
  		 * 属性设置中可包含三个字段:
  		 * type 表示属性类型、 value 表示属性初始值、 observer 表示属性值被更改时的响应函数
  		 */
  var properties: js.UndefOr[Props] = js.native
  var ready: js.UndefOr[js.Function0[Unit]] = js.native
}

object ComponentOptions {
  @scala.inline
  def apply[Instance, Data, Methods, Props](): ComponentOptions[Instance, Data, Methods, Props] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComponentOptions[Instance, Data, Methods, Props]]
  }
  @scala.inline
  implicit class ComponentOptionsOps[Self[instance, data, methods, props] <: ComponentOptions[instance, data, methods, props], Instance, Data, Methods, Props] (val x: Self[Instance, Data, Methods, Props]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Instance, Data, Methods, Props] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Instance, Data, Methods, Props]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[Instance, Data, Methods, Props]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[Instance, Data, Methods, Props]) with Other]
    @scala.inline
    def withAttached(value: () => Unit): Self[Instance, Data, Methods, Props] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attached")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutAttached: Self[Instance, Data, Methods, Props] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attached")(js.undefined)
        ret
    }
    @scala.inline
    def withBehaviors(
      value: js.Array[
          (ComponentOptions[
            Component[js.Object, js.Object], 
            DefaultData[Component[js.Object, js.Object]], 
            DefaultMethods[Component[js.Object, js.Object]], 
            PropsDefinition[DefaultProps]
          ]) | String
        ]
    ): Self[Instance, Data, Methods, Props] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("behaviors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBehaviors: Self[Instance, Data, Methods, Props] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("behaviors")(js.undefined)
        ret
    }
    @scala.inline
    def withCreated(value: () => Unit): Self[Instance, Data, Methods, Props] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutCreated: Self[Instance, Data, Methods, Props] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created")(js.undefined)
        ret
    }
    @scala.inline
    def withData(value: Data): Self[Instance, Data, Methods, Props] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self[Instance, Data, Methods, Props] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withDetached(value: () => Unit): Self[Instance, Data, Methods, Props] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detached")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutDetached: Self[Instance, Data, Methods, Props] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detached")(js.undefined)
        ret
    }
    @scala.inline
    def withExternalClasses(value: js.Array[String]): Self[Instance, Data, Methods, Props] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externalClasses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExternalClasses: Self[Instance, Data, Methods, Props] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externalClasses")(js.undefined)
        ret
    }
    @scala.inline
    def withLifetimes(value: PartialLifetimes): Self[Instance, Data, Methods, Props] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lifetimes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLifetimes: Self[Instance, Data, Methods, Props] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lifetimes")(js.undefined)
        ret
    }
    @scala.inline
    def withMethods(value: Methods): Self[Instance, Data, Methods, Props] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("methods")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMethods: Self[Instance, Data, Methods, Props] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("methods")(js.undefined)
        ret
    }
    @scala.inline
    def withMoved(value: () => Unit): Self[Instance, Data, Methods, Props] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moved")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutMoved: Self[Instance, Data, Methods, Props] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moved")(js.undefined)
        ret
    }
    @scala.inline
    def withOptions(value: PartialaddGlobalClassbool): Self[Instance, Data, Methods, Props] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptions: Self[Instance, Data, Methods, Props] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.undefined)
        ret
    }
    @scala.inline
    def withPageLifetimes(value: PartialPageLifetimes): Self[Instance, Data, Methods, Props] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageLifetimes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageLifetimes: Self[Instance, Data, Methods, Props] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageLifetimes")(js.undefined)
        ret
    }
    @scala.inline
    def withProperties(value: Props): Self[Instance, Data, Methods, Props] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProperties: Self[Instance, Data, Methods, Props] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(js.undefined)
        ret
    }
    @scala.inline
    def withReady(value: () => Unit): Self[Instance, Data, Methods, Props] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ready")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutReady: Self[Instance, Data, Methods, Props] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ready")(js.undefined)
        ret
    }
  }
  
}

