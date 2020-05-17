package typingsSlinky.layuiLayer.layer

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.jquery.JQuery
import typingsSlinky.layuiLayer.layuiLayerBooleans.`false`
import typingsSlinky.layuiLayer.layuiLayerNumbers.`-1`
import typingsSlinky.layuiLayer.layuiLayerNumbers.`0`
import typingsSlinky.layuiLayer.layuiLayerNumbers.`1`
import typingsSlinky.layuiLayer.layuiLayerNumbers.`2`
import typingsSlinky.layuiLayer.layuiLayerNumbers.`3`
import typingsSlinky.layuiLayer.layuiLayerNumbers.`4`
import typingsSlinky.layuiLayer.layuiLayerNumbers.`5`
import typingsSlinky.layuiLayer.layuiLayerNumbers.`6`
import typingsSlinky.layuiLayer.layuiLayerStrings.c
import typingsSlinky.layuiLayer.layuiLayerStrings.l
import typingsSlinky.layuiLayer.layuiLayerStrings.r
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 基础参数
  */
@js.native
trait Options extends js.Object {
  /**
    * 弹出动画
    * @default 0
    * @since 3.0
    * @example
    * -1    //关闭动画
    * 0    //平滑放大。默认
    * 1    //从上掉落
    * 2    //从最底部往上滑入
    * 3    //从左滑入
    * 4    //从左翻滚
    * 5    //渐显
    * 6    //抖动
    */
  var anim: js.UndefOr[`-1` | `0` | `1` | `2` | `3` | `4` | `5` | `6`] = js.native
  /**
    * 宽高
    * @default 'auto'
    * @example
    * '500px'    //定义宽度，高度自适应
    * ['500px', '300px']    //定义宽高
    */
  var area: js.UndefOr[String | (js.Tuple2[String, String])] = js.native
  /**
    * 按钮
    * @default '确认'
    * @description 信息框模式时，btn默认是一个确认按钮，其它层类型则默认不显示，加载层和tips层则无效。
    */
  var btn: js.UndefOr[String | js.Array[String]] = js.native
  //#region 按钮1的回调是yes，而从按钮2开始，则回调为btn2: function(){}，以此类推。
  var btn2: js.UndefOr[
    js.Function2[/* index */ Index, /* layero */ JQuery[HTMLElement], `false` | Unit]
  ] = js.native
  var btn3: js.UndefOr[
    js.Function2[/* index */ Index, /* layero */ JQuery[HTMLElement], `false` | Unit]
  ] = js.native
  var btn4: js.UndefOr[
    js.Function2[/* index */ Index, /* layero */ JQuery[HTMLElement], `false` | Unit]
  ] = js.native
  var btn5: js.UndefOr[
    js.Function2[/* index */ Index, /* layero */ JQuery[HTMLElement], `false` | Unit]
  ] = js.native
  var btn6: js.UndefOr[
    js.Function2[/* index */ Index, /* layero */ JQuery[HTMLElement], `false` | Unit]
  ] = js.native
  var btn7: js.UndefOr[
    js.Function2[/* index */ Index, /* layero */ JQuery[HTMLElement], `false` | Unit]
  ] = js.native
  var btn8: js.UndefOr[
    js.Function2[/* index */ Index, /* layero */ JQuery[HTMLElement], `false` | Unit]
  ] = js.native
  var btn9: js.UndefOr[
    js.Function2[/* index */ Index, /* layero */ JQuery[HTMLElement], `false` | Unit]
  ] = js.native
  /**
    * 按钮排列
    * @default 'r'
    * @example
    * 'l'    //按钮左对齐
    * 'c'    //按钮居中对齐
    * 'r'    //按钮右对齐。默认值，不用设置
    */
  var btnAlign: js.UndefOr[l | c | r] = js.native
  //#endregion
  /**
    * 右上角关闭按钮触发的回调
    * @param index 当前层索引
    * @param layero 当前层的DOM对象
    * @description 默认会自动触发关闭。如果不想关闭，`return false`
    */
  var cancel: js.UndefOr[
    js.Function2[/* index */ Index, /* layero */ JQuery[HTMLElement], `false` | Unit]
  ] = js.native
  /**
    * 关闭按钮
    * @description layer提供了两种风格的关闭按钮，可通过配置1和2来展示，如果不显示，则closeBtn: 0
    * @default 1
    */
  var closeBtn: js.UndefOr[`0` | `1` | `2`] = js.native
  /**
    * 内容
    * @default ''
    */
  var content: js.UndefOr[String | HTMLElement | JQuery[HTMLElement] | (js.Tuple2[String, String])] = js.native
  /**
    * 层销毁后触发的回调
    * @description 无论是确认还是取消，只要层被销毁了，end都会执行，不携带任何参数。
    */
  var end: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * @deprecated v3.0
    * @see {@link #fixed}
    */
  var fix: js.UndefOr[Boolean] = js.native
  /**
    * 固定
    * @default true
    * @description 鼠标滚动时，层是否固定在可视区域。
    */
  var fixed: js.UndefOr[Boolean] = js.native
  /**
    * 最大化后触发的回调
    * @param layero 当前层DOM
    */
  var full: js.UndefOr[js.Function1[/* layero */ JQuery[HTMLElement], Unit]] = js.native
  /**
    * 图标
    * 信息框和加载层的私有参数
    * @description 信息框默认不显示图标。当你想显示图标时，默认皮肤可以传入0-6如果是加载层，可以传入0-2。
    */
  var icon: js.UndefOr[Double] = js.native
  /**
    * 用于控制弹层唯一标识
    * @description 设置该值后，不管是什么类型的层，都只允许同时弹出一个。一般用于页面层和iframe层模式
    * @default ''
    */
  var id: js.UndefOr[String] = js.native
  /**
    * 关闭动画
    * @default true
    * @since 3.0.3
    */
  var isOutAnim: js.UndefOr[Boolean] = js.native
  /**
    * 最大高度
    * @since 3.1.0
    * @description 只有当高度自适应时，maxHeight的设定才有效。
    */
  var maxHeight: js.UndefOr[Double] = js.native
  /**
    * 最大宽度
    * @default 360
    * @description 只有当`area: 'auto'`时，maxWidth的设定才有效。
    */
  var maxWidth: js.UndefOr[Double] = js.native
  /**
    * 最大最小化
    * @default false
    * @description 显示最大小化按钮。该参数值对type:1和type:2有效。
    */
  var maxmin: js.UndefOr[Boolean] = js.native
  /**
    * 最小化后触发的回调
    * @param layero 当前层DOM
    * @description `return false` 不执行默认最小化。
    */
  var min: js.UndefOr[js.Function1[/* layero */ JQuery[HTMLElement], `false` | Unit]] = js.native
  /**
    * 触发拖动的元素
    * @default '.layui-layer-title'
    */
  var move: js.UndefOr[Selector | `false` | JQuery[HTMLElement]] = js.native
  /**
    * 拖动完毕后的回调方法
    * @param this 合并的选项
    * @param layero 当前层的DOM对象
    */
  var moveEnd: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* layero */ JQuery[HTMLElement], Unit]] = js.native
  /**
    * 是否允许拖拽到窗口外
    * @default false
    */
  var moveOut: js.UndefOr[Boolean] = js.native
  /**
    * @deprecated v3.0
    * @description 只提供默认的一种拖拽风格
    */
  var moveType: js.UndefOr[Double] = js.native
  /**
    * 坐标
    * @default 'auto'
    * @example
    * 'auto'    //默认坐标，即垂直水平居中
    * '100px'    //只定义top坐标，水平保持居中
    * ['100px', '50px']    //同时定义top、left坐标
    * 't'    //快捷设置顶部坐标
    * 'r'    //快捷设置右边缘坐标
    * 'b'    //快捷设置底部坐标
    * 'l'    //快捷设置左边缘坐标
    * 'lt'    //快捷设置左上角
    * 'lb'    //快捷设置左下角
    * 'rt'    //快捷设置右上角
    * 'rb'    //快捷设置右下角
    */
  var offset: js.UndefOr[String | (js.Tuple2[String, String])] = js.native
  /**
    * 是否允许拉伸
    * @default true
    * @description 可以在弹层右下角拖动来拉伸尺寸。该参数对loading、tips层无效
    */
  var resize: js.UndefOr[Boolean] = js.native
  /**
    * 监听窗口拉伸动作
    * @param layero 当前层的DOM对象
    */
  var resizing: js.UndefOr[js.Function1[/* layero */ JQuery[HTMLElement], Unit]] = js.native
  /**
    * 还原后触发的回调
    * @param layero 当前层DOM
    */
  var restore: js.UndefOr[js.Function1[/* layero */ JQuery[HTMLElement], Unit]] = js.native
  /**
    * 是否允许浏览器出现滚动条
    * @default true
    */
  var scrollbar: js.UndefOr[Boolean] = js.native
  /**
    * 遮罩
    * @default 0.3
    * @example [0.8, '#393D49']    //透明度、颜色
    */
  var shade: js.UndefOr[Double | `false` | (js.Tuple2[Double, String])] = js.native
  /**
    * 是否点击遮罩关闭
    * @description 如果你的shade是存在的，那么你可以设定shadeClose来控制点击弹层外区域关闭。
    * @default false
    */
  var shadeClose: js.UndefOr[Boolean] = js.native
  /**
    * @deprecated v3.0
    * @see {@link #anim}
    */
  var shift: js.UndefOr[Double] = js.native
  /**
    * 样式类名
    * @default ''
    */
  var skin: js.UndefOr[String] = js.native
  /**
    * 层弹出后的成功回调方法
    * @param layero 当前层DOM
    * @param index 当前层索引
    */
  var success: js.UndefOr[js.Function2[/* layero */ JQuery[HTMLElement], /* index */ Index, Unit]] = js.native
  /**
    * 自动关闭所需毫秒
    * @default 0 //不会自动关闭
    */
  var time: js.UndefOr[Double] = js.native
  /**
    * tips方向和颜色
    * @default 2
    * @description tips层的私有参数。
    * @example
    * 1    //上
    * 2    //右
    * 3    //下
    * 4    //左
    * [1, '#c00']  //方向，颜色
    */
  var tips: js.UndefOr[Double | (js.Tuple2[Double, String])] = js.native
  /**
    * 是否允许多个tips
    * @default false
    * @description 允许多个意味着不会销毁之前的tips层。
    */
  var tipsMore: js.UndefOr[Boolean] = js.native
  /**
    * 标题
    * @default '信息'
    * @example
    * '我是标题'
    * ['文本', 'font-size:18px;']
    * false    //不显示标题栏
    */
  var title: js.UndefOr[String | `false` | (js.Tuple2[String, String])] = js.native
  /**
    * 基本层类型
    * @default 0
    */
  var `type`: js.UndefOr[`3` | `2` | `4` | `0` | `1`] = js.native
  /**
    * 确定按钮回调方法
    * @param index 当前层索引
    * @param layero 当前层DOM对象
    * @description 如果设定了yes回调，需进行手工关闭，`close(index)`
    */
  var yes: js.UndefOr[js.Function2[/* index */ Index, /* layero */ JQuery[HTMLElement], Unit]] = js.native
  /**
    * 层叠顺序
    * @default 19891014
    * @description 一般用于解决和其它组件的层叠冲突。
    */
  var zIndex: js.UndefOr[Double] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnim(value: `-1` | `0` | `1` | `2` | `3` | `4` | `5` | `6`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anim")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnim: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anim")(js.undefined)
        ret
    }
    @scala.inline
    def withArea(value: String | (js.Tuple2[String, String])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("area")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArea: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("area")(js.undefined)
        ret
    }
    @scala.inline
    def withBtn(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("btn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBtn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("btn")(js.undefined)
        ret
    }
    @scala.inline
    def withBtn2(value: (/* index */ Index, /* layero */ JQuery[HTMLElement]) => `false` | Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("btn2")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutBtn2: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("btn2")(js.undefined)
        ret
    }
    @scala.inline
    def withBtn3(value: (/* index */ Index, /* layero */ JQuery[HTMLElement]) => `false` | Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("btn3")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutBtn3: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("btn3")(js.undefined)
        ret
    }
    @scala.inline
    def withBtn4(value: (/* index */ Index, /* layero */ JQuery[HTMLElement]) => `false` | Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("btn4")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutBtn4: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("btn4")(js.undefined)
        ret
    }
    @scala.inline
    def withBtn5(value: (/* index */ Index, /* layero */ JQuery[HTMLElement]) => `false` | Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("btn5")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutBtn5: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("btn5")(js.undefined)
        ret
    }
    @scala.inline
    def withBtn6(value: (/* index */ Index, /* layero */ JQuery[HTMLElement]) => `false` | Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("btn6")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutBtn6: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("btn6")(js.undefined)
        ret
    }
    @scala.inline
    def withBtn7(value: (/* index */ Index, /* layero */ JQuery[HTMLElement]) => `false` | Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("btn7")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutBtn7: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("btn7")(js.undefined)
        ret
    }
    @scala.inline
    def withBtn8(value: (/* index */ Index, /* layero */ JQuery[HTMLElement]) => `false` | Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("btn8")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutBtn8: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("btn8")(js.undefined)
        ret
    }
    @scala.inline
    def withBtn9(value: (/* index */ Index, /* layero */ JQuery[HTMLElement]) => `false` | Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("btn9")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutBtn9: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("btn9")(js.undefined)
        ret
    }
    @scala.inline
    def withBtnAlign(value: l | c | r): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("btnAlign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBtnAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("btnAlign")(js.undefined)
        ret
    }
    @scala.inline
    def withCancel(value: (/* index */ Index, /* layero */ JQuery[HTMLElement]) => `false` | Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutCancel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel")(js.undefined)
        ret
    }
    @scala.inline
    def withCloseBtn(value: `0` | `1` | `2`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeBtn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloseBtn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeBtn")(js.undefined)
        ret
    }
    @scala.inline
    def withContentHTMLElement(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContent(value: String | HTMLElement | JQuery[HTMLElement] | (js.Tuple2[String, String])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(js.undefined)
        ret
    }
    @scala.inline
    def withEnd(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(js.undefined)
        ret
    }
    @scala.inline
    def withFix(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fix")(js.undefined)
        ret
    }
    @scala.inline
    def withFixed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFixed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixed")(js.undefined)
        ret
    }
    @scala.inline
    def withFull(value: /* layero */ JQuery[HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("full")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("full")(js.undefined)
        ret
    }
    @scala.inline
    def withIcon(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withIsOutAnim(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOutAnim")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsOutAnim: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOutAnim")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxmin(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxmin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxmin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxmin")(js.undefined)
        ret
    }
    @scala.inline
    def withMin(value: /* layero */ JQuery[HTMLElement] => `false` | Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutMin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(js.undefined)
        ret
    }
    @scala.inline
    def withMove(value: Selector | `false` | JQuery[HTMLElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("move")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("move")(js.undefined)
        ret
    }
    @scala.inline
    def withMoveEnd(value: js.ThisFunction1[Options, /* layero */ JQuery[HTMLElement], Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMoveEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withMoveOut(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveOut")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMoveOut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveOut")(js.undefined)
        ret
    }
    @scala.inline
    def withMoveType(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMoveType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveType")(js.undefined)
        ret
    }
    @scala.inline
    def withOffset(value: String | (js.Tuple2[String, String])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(js.undefined)
        ret
    }
    @scala.inline
    def withResize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resize")(js.undefined)
        ret
    }
    @scala.inline
    def withResizing(value: /* layero */ JQuery[HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizing")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutResizing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizing")(js.undefined)
        ret
    }
    @scala.inline
    def withRestore(value: /* layero */ JQuery[HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restore")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRestore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restore")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollbar(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollbar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollbar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollbar")(js.undefined)
        ret
    }
    @scala.inline
    def withShade(value: Double | `false` | (js.Tuple2[Double, String])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shade")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShade: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shade")(js.undefined)
        ret
    }
    @scala.inline
    def withShadeClose(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadeClose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShadeClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadeClose")(js.undefined)
        ret
    }
    @scala.inline
    def withShift(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shift")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShift: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shift")(js.undefined)
        ret
    }
    @scala.inline
    def withSkin(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skin")(js.undefined)
        ret
    }
    @scala.inline
    def withSuccess(value: (/* layero */ JQuery[HTMLElement], /* index */ Index) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSuccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(js.undefined)
        ret
    }
    @scala.inline
    def withTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time")(js.undefined)
        ret
    }
    @scala.inline
    def withTips(value: Double | (js.Tuple2[Double, String])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tips")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTips: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tips")(js.undefined)
        ret
    }
    @scala.inline
    def withTipsMore(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tipsMore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTipsMore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tipsMore")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String | `false` | (js.Tuple2[String, String])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: `3` | `2` | `4` | `0` | `1`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withYes(value: (/* index */ Index, /* layero */ JQuery[HTMLElement]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yes")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutYes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yes")(js.undefined)
        ret
    }
    @scala.inline
    def withZIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zIndex")(js.undefined)
        ret
    }
  }
  
}

