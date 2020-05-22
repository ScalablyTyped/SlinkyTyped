package typingsSlinky.antDesignCompatible.formFormMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DomScrollIntoViewConfig extends js.Object {
  /** 是否和左边界对齐 */
  var alignWithLeft: js.UndefOr[Boolean] = js.undefined
  /** 是否和上边界对齐  */
  var alignWithTop: js.UndefOr[Boolean] = js.undefined
  /** 是否允许容器水平滚动 */
  var allowHorizontalScroll: js.UndefOr[Boolean] = js.undefined
  /** 底部偏移量 */
  var offsetBottom: js.UndefOr[Double] = js.undefined
  /** 左侧偏移量 */
  var offsetLeft: js.UndefOr[Double] = js.undefined
  /** 右侧偏移量 */
  var offsetRight: js.UndefOr[Double] = js.undefined
  /** 顶部偏移量 */
  var offsetTop: js.UndefOr[Double] = js.undefined
  /** 当内容可见时是否允许滚动容器 */
  var onlyScrollIfNeeded: js.UndefOr[Boolean] = js.undefined
}

object DomScrollIntoViewConfig {
  @scala.inline
  def apply(
    alignWithLeft: js.UndefOr[Boolean] = js.undefined,
    alignWithTop: js.UndefOr[Boolean] = js.undefined,
    allowHorizontalScroll: js.UndefOr[Boolean] = js.undefined,
    offsetBottom: js.UndefOr[Double] = js.undefined,
    offsetLeft: js.UndefOr[Double] = js.undefined,
    offsetRight: js.UndefOr[Double] = js.undefined,
    offsetTop: js.UndefOr[Double] = js.undefined,
    onlyScrollIfNeeded: js.UndefOr[Boolean] = js.undefined
  ): DomScrollIntoViewConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alignWithLeft)) __obj.updateDynamic("alignWithLeft")(alignWithLeft.get.asInstanceOf[js.Any])
    if (!js.isUndefined(alignWithTop)) __obj.updateDynamic("alignWithTop")(alignWithTop.get.asInstanceOf[js.Any])
    if (!js.isUndefined(allowHorizontalScroll)) __obj.updateDynamic("allowHorizontalScroll")(allowHorizontalScroll.get.asInstanceOf[js.Any])
    if (!js.isUndefined(offsetBottom)) __obj.updateDynamic("offsetBottom")(offsetBottom.get.asInstanceOf[js.Any])
    if (!js.isUndefined(offsetLeft)) __obj.updateDynamic("offsetLeft")(offsetLeft.get.asInstanceOf[js.Any])
    if (!js.isUndefined(offsetRight)) __obj.updateDynamic("offsetRight")(offsetRight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(offsetTop)) __obj.updateDynamic("offsetTop")(offsetTop.get.asInstanceOf[js.Any])
    if (!js.isUndefined(onlyScrollIfNeeded)) __obj.updateDynamic("onlyScrollIfNeeded")(onlyScrollIfNeeded.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomScrollIntoViewConfig]
  }
}

