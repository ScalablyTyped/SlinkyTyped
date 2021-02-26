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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsMod {
  
  @JSImport("@blueprintjs/select/lib/esm/components", "MultiSelect")
  @js.native
  class MultiSelect[T] protected ()
    extends typingsSlinky.blueprintjsSelect.multiSelectMod.MultiSelect[T] {
    def this(props: IMultiSelectProps[T]) = this()
    def this(props: IMultiSelectProps[T], context: js.Any) = this()
  }
  /* static members */
  object MultiSelect {
    
    @JSImport("@blueprintjs/select/lib/esm/components", "MultiSelect")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/select/lib/esm/components", "MultiSelect.defaultProps")
    @js.native
    def defaultProps: Fill = js.native
    @scala.inline
    def defaultProps_=(x: Fill): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/select/lib/esm/components", "MultiSelect.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/select/lib/esm/components", "MultiSelect.ofType")
    @js.native
    def ofType[U](): Instantiable1[
        /* props */ IMultiSelectProps[U], 
        typingsSlinky.blueprintjsSelect.multiSelectMod.MultiSelect[U]
      ] = js.native
  }
  
  @JSImport("@blueprintjs/select/lib/esm/components", "Omnibar")
  @js.native
  class Omnibar[T] protected ()
    extends typingsSlinky.blueprintjsSelect.omnibarMod.Omnibar[T] {
    def this(props: IOmnibarProps[T]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: IOmnibarProps[T], context: js.Any) = this()
  }
  /* static members */
  object Omnibar {
    
    @JSImport("@blueprintjs/select/lib/esm/components", "Omnibar")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/select/lib/esm/components", "Omnibar.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/select/lib/esm/components", "Omnibar.ofType")
    @js.native
    def ofType[U](): Instantiable1[
        /* props */ IOmnibarProps[U], 
        typingsSlinky.blueprintjsSelect.omnibarMod.Omnibar[U]
      ] = js.native
  }
  
  @JSImport("@blueprintjs/select/lib/esm/components", "QueryList")
  @js.native
  class QueryList[T] protected ()
    extends typingsSlinky.blueprintjsSelect.queryListMod.QueryList[T] {
    def this(props: IQueryListProps[T]) = this()
    def this(props: IQueryListProps[T], context: js.Any) = this()
  }
  /* static members */
  object QueryList {
    
    @JSImport("@blueprintjs/select/lib/esm/components", "QueryList")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/select/lib/esm/components", "QueryList.defaultProps")
    @js.native
    def defaultProps: Disabled = js.native
    @scala.inline
    def defaultProps_=(x: Disabled): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/select/lib/esm/components", "QueryList.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/select/lib/esm/components", "QueryList.ofType")
    @js.native
    def ofType[U](): Instantiable1[
        /* props */ IQueryListProps[U], 
        typingsSlinky.blueprintjsSelect.queryListMod.QueryList[U]
      ] = js.native
  }
  
  @JSImport("@blueprintjs/select/lib/esm/components", "Select")
  @js.native
  class Select[T] protected ()
    extends typingsSlinky.blueprintjsSelect.selectMod.Select[T] {
    def this(props: ISelectProps[T]) = this()
    def this(props: ISelectProps[T], context: js.Any) = this()
  }
  /* static members */
  object Select {
    
    @JSImport("@blueprintjs/select/lib/esm/components", "Select")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/select/lib/esm/components", "Select.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/select/lib/esm/components", "Select.ofType")
    @js.native
    def ofType[U](): Instantiable1[/* props */ ISelectProps[U], typingsSlinky.blueprintjsSelect.selectMod.Select[U]] = js.native
  }
  
  @JSImport("@blueprintjs/select/lib/esm/components", "Suggest")
  @js.native
  class Suggest[T] protected ()
    extends typingsSlinky.blueprintjsSelect.suggestMod.Suggest[T] {
    def this(props: ISuggestProps[T]) = this()
    def this(props: ISuggestProps[T], context: js.Any) = this()
  }
  /* static members */
  object Suggest {
    
    @JSImport("@blueprintjs/select/lib/esm/components", "Suggest")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/select/lib/esm/components", "Suggest.defaultProps")
    @js.native
    def defaultProps: PartialISuggestPropsany = js.native
    @scala.inline
    def defaultProps_=(x: PartialISuggestPropsany): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/select/lib/esm/components", "Suggest.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/select/lib/esm/components", "Suggest.ofType")
    @js.native
    def ofType[U](): Instantiable1[
        /* props */ ISuggestProps[U], 
        typingsSlinky.blueprintjsSelect.suggestMod.Suggest[U]
      ] = js.native
  }
  
  @JSImport("@blueprintjs/select/lib/esm/components", "getFirstEnabledItem")
  @js.native
  def getFirstEnabledItem[T](items: js.Array[T]): T | ICreateNewItem | Null = js.native
  @JSImport("@blueprintjs/select/lib/esm/components", "getFirstEnabledItem")
  @js.native
  def getFirstEnabledItem[T](
    items: js.Array[T],
    itemDisabled: js.UndefOr[scala.Nothing],
    direction: js.UndefOr[scala.Nothing],
    startIndex: Double
  ): T | ICreateNewItem | Null = js.native
  @JSImport("@blueprintjs/select/lib/esm/components", "getFirstEnabledItem")
  @js.native
  def getFirstEnabledItem[T](items: js.Array[T], itemDisabled: js.UndefOr[scala.Nothing], direction: Double): T | ICreateNewItem | Null = js.native
  @JSImport("@blueprintjs/select/lib/esm/components", "getFirstEnabledItem")
  @js.native
  def getFirstEnabledItem[T](items: js.Array[T], itemDisabled: js.UndefOr[scala.Nothing], direction: Double, startIndex: Double): T | ICreateNewItem | Null = js.native
  @JSImport("@blueprintjs/select/lib/esm/components", "getFirstEnabledItem")
  @js.native
  def getFirstEnabledItem[T](items: js.Array[T], itemDisabled: /* keyof T */ String): T | ICreateNewItem | Null = js.native
  @JSImport("@blueprintjs/select/lib/esm/components", "getFirstEnabledItem")
  @js.native
  def getFirstEnabledItem[T](
    items: js.Array[T],
    itemDisabled: /* keyof T */ String,
    direction: js.UndefOr[scala.Nothing],
    startIndex: Double
  ): T | ICreateNewItem | Null = js.native
  @JSImport("@blueprintjs/select/lib/esm/components", "getFirstEnabledItem")
  @js.native
  def getFirstEnabledItem[T](items: js.Array[T], itemDisabled: /* keyof T */ String, direction: Double): T | ICreateNewItem | Null = js.native
  @JSImport("@blueprintjs/select/lib/esm/components", "getFirstEnabledItem")
  @js.native
  def getFirstEnabledItem[T](items: js.Array[T], itemDisabled: /* keyof T */ String, direction: Double, startIndex: Double): T | ICreateNewItem | Null = js.native
  @JSImport("@blueprintjs/select/lib/esm/components", "getFirstEnabledItem")
  @js.native
  def getFirstEnabledItem[T](items: js.Array[T], itemDisabled: js.Function2[/* item */ T, /* index */ Double, Boolean]): T | ICreateNewItem | Null = js.native
  @JSImport("@blueprintjs/select/lib/esm/components", "getFirstEnabledItem")
  @js.native
  def getFirstEnabledItem[T](
    items: js.Array[T],
    itemDisabled: js.Function2[/* item */ T, /* index */ Double, Boolean],
    direction: js.UndefOr[scala.Nothing],
    startIndex: Double
  ): T | ICreateNewItem | Null = js.native
  @JSImport("@blueprintjs/select/lib/esm/components", "getFirstEnabledItem")
  @js.native
  def getFirstEnabledItem[T](
    items: js.Array[T],
    itemDisabled: js.Function2[/* item */ T, /* index */ Double, Boolean],
    direction: Double
  ): T | ICreateNewItem | Null = js.native
  @JSImport("@blueprintjs/select/lib/esm/components", "getFirstEnabledItem")
  @js.native
  def getFirstEnabledItem[T](
    items: js.Array[T],
    itemDisabled: js.Function2[/* item */ T, /* index */ Double, Boolean],
    direction: Double,
    startIndex: Double
  ): T | ICreateNewItem | Null = js.native
}
