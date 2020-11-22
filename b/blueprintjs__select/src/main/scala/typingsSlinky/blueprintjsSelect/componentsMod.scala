package typingsSlinky.blueprintjsSelect

import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.blueprintjsSelect.anon.Disabled
import typingsSlinky.blueprintjsSelect.anon.Fill
import typingsSlinky.blueprintjsSelect.anon.PartialISuggestPropsany
import typingsSlinky.blueprintjsSelect.listItemsUtilsMod.ICreateNewItem
import typingsSlinky.blueprintjsSelect.multiSelectMod.IMultiSelectProps
import typingsSlinky.blueprintjsSelect.omnibarMod.IOmnibarProps
import typingsSlinky.blueprintjsSelect.queryListMod.IQueryListProps
import typingsSlinky.blueprintjsSelect.selectMod.ISelectProps
import typingsSlinky.blueprintjsSelect.suggestMod.ISuggestProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/select/lib/esm/components", JSImport.Namespace)
@js.native
object componentsMod extends js.Object {
  
  def getFirstEnabledItem[T](items: js.Array[T]): T | ICreateNewItem | Null = js.native
  def getFirstEnabledItem[T](
    items: js.Array[T],
    itemDisabled: js.UndefOr[scala.Nothing],
    direction: js.UndefOr[scala.Nothing],
    startIndex: Double
  ): T | ICreateNewItem | Null = js.native
  def getFirstEnabledItem[T](items: js.Array[T], itemDisabled: js.UndefOr[scala.Nothing], direction: Double): T | ICreateNewItem | Null = js.native
  def getFirstEnabledItem[T](items: js.Array[T], itemDisabled: js.UndefOr[scala.Nothing], direction: Double, startIndex: Double): T | ICreateNewItem | Null = js.native
  def getFirstEnabledItem[T](items: js.Array[T], itemDisabled: /* keyof T */ String): T | ICreateNewItem | Null = js.native
  def getFirstEnabledItem[T](
    items: js.Array[T],
    itemDisabled: /* keyof T */ String,
    direction: js.UndefOr[scala.Nothing],
    startIndex: Double
  ): T | ICreateNewItem | Null = js.native
  def getFirstEnabledItem[T](items: js.Array[T], itemDisabled: /* keyof T */ String, direction: Double): T | ICreateNewItem | Null = js.native
  def getFirstEnabledItem[T](items: js.Array[T], itemDisabled: /* keyof T */ String, direction: Double, startIndex: Double): T | ICreateNewItem | Null = js.native
  def getFirstEnabledItem[T](items: js.Array[T], itemDisabled: js.Function2[/* item */ T, /* index */ Double, Boolean]): T | ICreateNewItem | Null = js.native
  def getFirstEnabledItem[T](
    items: js.Array[T],
    itemDisabled: js.Function2[/* item */ T, /* index */ Double, Boolean],
    direction: js.UndefOr[scala.Nothing],
    startIndex: Double
  ): T | ICreateNewItem | Null = js.native
  def getFirstEnabledItem[T](
    items: js.Array[T],
    itemDisabled: js.Function2[/* item */ T, /* index */ Double, Boolean],
    direction: Double
  ): T | ICreateNewItem | Null = js.native
  def getFirstEnabledItem[T](
    items: js.Array[T],
    itemDisabled: js.Function2[/* item */ T, /* index */ Double, Boolean],
    direction: Double,
    startIndex: Double
  ): T | ICreateNewItem | Null = js.native
  
  @js.native
  class MultiSelect[T] ()
    extends typingsSlinky.blueprintjsSelect.multiSelectMod.MultiSelect[T]
  /* static members */
  @js.native
  object MultiSelect extends js.Object {
    
    var defaultProps: Fill = js.native
    
    var displayName: String = js.native
    
    def ofType[U](): Instantiable1[
        /* props */ IMultiSelectProps[U], 
        typingsSlinky.blueprintjsSelect.multiSelectMod.MultiSelect[U]
      ] = js.native
  }
  
  @js.native
  class Omnibar[T] ()
    extends typingsSlinky.blueprintjsSelect.omnibarMod.Omnibar[T]
  /* static members */
  @js.native
  object Omnibar extends js.Object {
    
    var displayName: String = js.native
    
    def ofType[U](): Instantiable1[
        /* props */ IOmnibarProps[U], 
        typingsSlinky.blueprintjsSelect.omnibarMod.Omnibar[U]
      ] = js.native
  }
  
  @js.native
  class QueryList[T] protected ()
    extends typingsSlinky.blueprintjsSelect.queryListMod.QueryList[T] {
    def this(props: IQueryListProps[T]) = this()
    def this(props: IQueryListProps[T], context: js.Any) = this()
  }
  /* static members */
  @js.native
  object QueryList extends js.Object {
    
    var defaultProps: Disabled = js.native
    
    var displayName: String = js.native
    
    def ofType[U](): Instantiable1[
        /* props */ IQueryListProps[U], 
        typingsSlinky.blueprintjsSelect.queryListMod.QueryList[U]
      ] = js.native
  }
  
  @js.native
  class Select[T] ()
    extends typingsSlinky.blueprintjsSelect.selectMod.Select[T]
  /* static members */
  @js.native
  object Select extends js.Object {
    
    var displayName: String = js.native
    
    def ofType[U](): Instantiable1[/* props */ ISelectProps[U], typingsSlinky.blueprintjsSelect.selectMod.Select[U]] = js.native
  }
  
  @js.native
  class Suggest[T] ()
    extends typingsSlinky.blueprintjsSelect.suggestMod.Suggest[T]
  /* static members */
  @js.native
  object Suggest extends js.Object {
    
    var defaultProps: PartialISuggestPropsany = js.native
    
    var displayName: String = js.native
    
    def ofType[U](): Instantiable1[
        /* props */ ISuggestProps[U], 
        typingsSlinky.blueprintjsSelect.suggestMod.Suggest[U]
      ] = js.native
  }
}
