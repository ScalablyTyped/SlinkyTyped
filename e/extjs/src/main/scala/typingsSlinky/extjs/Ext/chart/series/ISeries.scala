package typingsSlinky.extjs.Ext.chart.series

import typingsSlinky.extjs.Ext.Array
import typingsSlinky.extjs.Ext.data.IModel
import typingsSlinky.extjs.Ext.draw.ISprite
import typingsSlinky.extjs.Ext.util.IObservable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.extjs.Ext.IClass because Already inherited
- typingsSlinky.extjs.Ext.IBase because Already inherited
- typingsSlinky.extjs.Ext.chart.IHighlight because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, extend, getInitialConfig, inheritableStatics, initConfig, mixins, requires, self, singleton, statics, uses. Inlined highlight, highlightCfg, highlightItem, unHighlightItem
- typingsSlinky.extjs.Ext.chart.ILabel because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, extend, getInitialConfig, inheritableStatics, initConfig, mixins, requires, self, singleton, statics, uses. Inlined label, onCreateLabel, onPlaceLabel */ @js.native
trait ISeries extends IObservable {
  /** [Method] Iterate over each of the records for this series
  		* @param fn Function The function to execute for each record.
  		* @param scope Object Scope for the fn.
  		*/
  var eachRecord: js.UndefOr[js.Function2[/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] For a given x y point relative to the Surface find a corresponding item from this series if any
  		* @param x Number
  		* @param y Number
  		* @returns Object An object describing the item, or null if there is no matching item. The exact contents of this object will vary by series type, but should always contain the following:
  		*/
  var getItemForPoint: js.UndefOr[js.Function2[/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double], _]] = js.native
  /** [Method] Returns a string with the color to be used for the series legend item
  		* @param index Object
  		*/
  var getLegendColor: js.UndefOr[js.Function1[/* index */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Return the number of records being displayed in this series  */
  var getRecordCount: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Hides all the elements in the series  */
  var hideAll: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Config Option] (Boolean/Object) */
  var highlight: js.UndefOr[js.Any] = js.native
  /** [Property] (Object) */
  var highlightCfg: js.UndefOr[js.Any] = js.native
  /** [Method] Highlight the given series item
  		* @param item Object Info about the item; same format as returned by #getItemForPoint.
  		*/
  var highlightItem: js.UndefOr[js.Function1[js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Determines whether the series item at the given index has been excluded i e
  		* @param index Object
  		*/
  var isExcluded: js.UndefOr[js.Function1[/* index */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Config Option] (Object) */
  var label: js.UndefOr[js.Any] = js.native
  /** [Method] Called each time a new label is created
  		* @param storeItem Ext.data.Model The element of the store that is related to the sprite.
  		* @param item Object The item related to the sprite. An item is an object containing the position of the shape used to describe the visualization and also pointing to the actual shape (circle, rectangle, path, etc).
  		* @param i Number The index of the element created (i.e the first created label, second created label, etc).
  		* @param display String The label.display type. May be false if the label is hidden
  		* @returns Ext.draw.Sprite The created sprite that will draw the label.
  		*/
  var onCreateLabel: js.UndefOr[
    js.Function4[js.UndefOr[IModel], js.UndefOr[js.Any], js.UndefOr[Double], js.UndefOr[String], ISprite]
  ] = js.native
  /** [Method] Called for updating the position of the label
  		* @param label Ext.draw.Sprite The sprite that draws the label.
  		* @param storeItem Ext.data.Model The element of the store that is related to the sprite.
  		* @param item Object The item related to the sprite. An item is an object containing the position of the shape used to describe the visualization and also pointing to the actual shape (circle, rectangle, path, etc).
  		* @param i Number The index of the element to be updated (i.e. whether it is the first, second, third from the labelGroup)
  		* @param display String The label.display type. May be false if the label is hidden
  		* @param animate Boolean A boolean value to set or unset animations for the labels.
  		* @param index Number The series index.
  		*/
  var onPlaceLabel: js.UndefOr[
    js.Function7[
      js.UndefOr[ISprite], 
      js.UndefOr[IModel], 
      js.UndefOr[js.Any], 
      js.UndefOr[Double], 
      js.UndefOr[String], 
      js.UndefOr[Boolean], 
      js.UndefOr[Double], 
      Unit
    ]
  ] = js.native
  /** [Config Option] (Function) */
  var renderer: js.UndefOr[js.Any] = js.native
  /** [Method] Changes the value of the title for the series
  		* @param index Number
  		* @param title String
  		*/
  var setTitle: js.UndefOr[
    js.Function2[/* index */ js.UndefOr[Double], /* title */ js.UndefOr[String], Unit]
  ] = js.native
  /** [Config Option] (Array) */
  var shadowAttributes: js.UndefOr[Array] = js.native
  /** [Method] Shows all the elements in the series  */
  var showAll: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Config Option] (Boolean) */
  var showInLegend: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Object) */
  var tips: js.UndefOr[js.Any] = js.native
  /** [Config Option] (String) */
  var title: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var `type`: js.UndefOr[String] = js.native
  /** [Method] Un highlight any existing highlights */
  var unHighlightItem: js.UndefOr[js.Function0[Unit]] = js.native
}

object ISeries {
  @scala.inline
  def apply(): ISeries = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISeries]
  }
  @scala.inline
  implicit class ISeriesOps[Self <: ISeries] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEachRecord(value: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eachRecord")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutEachRecord: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eachRecord")(js.undefined)
        ret
    }
    @scala.inline
    def withGetItemForPoint(value: (/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double]) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getItemForPoint")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutGetItemForPoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getItemForPoint")(js.undefined)
        ret
    }
    @scala.inline
    def withGetLegendColor(value: /* index */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLegendColor")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetLegendColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLegendColor")(js.undefined)
        ret
    }
    @scala.inline
    def withGetRecordCount(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRecordCount")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetRecordCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRecordCount")(js.undefined)
        ret
    }
    @scala.inline
    def withHideAll(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideAll")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutHideAll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideAll")(js.undefined)
        ret
    }
    @scala.inline
    def withHighlight(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighlight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlight")(js.undefined)
        ret
    }
    @scala.inline
    def withHighlightCfg(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightCfg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighlightCfg: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightCfg")(js.undefined)
        ret
    }
    @scala.inline
    def withHighlightItem(value: js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightItem")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutHighlightItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightItem")(js.undefined)
        ret
    }
    @scala.inline
    def withIsExcluded(value: /* index */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isExcluded")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutIsExcluded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isExcluded")(js.undefined)
        ret
    }
    @scala.inline
    def withLabel(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCreateLabel(value: (js.UndefOr[IModel], js.UndefOr[js.Any], js.UndefOr[Double], js.UndefOr[String]) => ISprite): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCreateLabel")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutOnCreateLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCreateLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPlaceLabel(
      value: (js.UndefOr[ISprite], js.UndefOr[IModel], js.UndefOr[js.Any], js.UndefOr[Double], js.UndefOr[String], js.UndefOr[Boolean], js.UndefOr[Double]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPlaceLabel")(js.Any.fromFunction7(value))
        ret
    }
    @scala.inline
    def withoutOnPlaceLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPlaceLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderer(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenderer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderer")(js.undefined)
        ret
    }
    @scala.inline
    def withSetTitle(value: (/* index */ js.UndefOr[Double], /* title */ js.UndefOr[String]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTitle")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSetTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withShadowAttributes(value: Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadowAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShadowAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadowAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withShowAll(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showAll")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutShowAll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showAll")(js.undefined)
        ret
    }
    @scala.inline
    def withShowInLegend(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showInLegend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowInLegend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showInLegend")(js.undefined)
        ret
    }
    @scala.inline
    def withTips(value: js.Any): Self = {
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
    def withTitle(value: String): Self = {
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
    def withType(value: String): Self = {
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
    def withUnHighlightItem(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unHighlightItem")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutUnHighlightItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unHighlightItem")(js.undefined)
        ret
    }
  }
  
}

