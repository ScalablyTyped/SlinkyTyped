package typingsSlinky.activexLibreoffice.com_.sun.star

import typingsSlinky.activexLibreoffice.LibreOffice.SeqEquiv
import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`0`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`1`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`2`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`3`
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typingsSlinky.activexLibreoffice.com_.sun.star.container.XIndexAccess
import typingsSlinky.activexLibreoffice.com_.sun.star.container.XNameAccess
import typingsSlinky.activexLibreoffice.com_.sun.star.graphic.XGraphic
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.XComponent
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.XInitialization
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsSlinky.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gallery {
  
  /** service to get access to the properties of a single Gallery item */
  @js.native
  trait GalleryItem
    extends XGalleryItem
       with XPropertySet {
    
    /**
      * the drawing content of the Gallery item
      *
      * This is an optional property and may not available for every item
      */
    var Drawing: XComponent = js.native
    
    /**
      * The type of the Gallery item
      * @see GalleryItemType
      */
    var GalleryItemType: Double = js.native
    
    /**
      * the graphic content of the Gallery item
      *
      * This is an optional property and may not available for every item
      */
    var Graphic: XGraphic = js.native
    
    /**
      * the thumbnail of the Gallery item
      *
      * The thumbnail may be either a pixel or a vector graphic
      */
    var Thumbnail: XGraphic = js.native
    
    /** the title of the Gallery item */
    var Title: String = js.native
    
    /**
      * the URL of the Gallery item
      *
      * The interpretation of the URL depends on the type of the Gallery item. In case of graphic and media items, the URL is a "real" URL, in case of
      * drawings it is a private URL
      */
    var URL: String = js.native
  }
  object GalleryItem {
    
    @scala.inline
    def apply(
      Drawing: XComponent,
      GalleryItemType: Double,
      Graphic: XGraphic,
      PropertySetInfo: XPropertySetInfo,
      Thumbnail: XGraphic,
      Title: String,
      Type: Double,
      URL: String,
      acquire: () => Unit,
      addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
      addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
      getPropertySetInfo: () => XPropertySetInfo,
      getPropertyValue: String => js.Any,
      getType: () => Double,
      queryInterface: `type` => js.Any,
      release: () => Unit,
      removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
      removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
      setPropertyValue: (String, js.Any) => Unit
    ): GalleryItem = {
      val __obj = js.Dynamic.literal(Drawing = Drawing.asInstanceOf[js.Any], GalleryItemType = GalleryItemType.asInstanceOf[js.Any], Graphic = Graphic.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], Thumbnail = Thumbnail.asInstanceOf[js.Any], Title = Title.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], URL = URL.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getType = js.Any.fromFunction0(getType), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
      __obj.asInstanceOf[GalleryItem]
    }
    
    @scala.inline
    implicit class GalleryItemMutableBuilder[Self <: GalleryItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDrawing(value: XComponent): Self = StObject.set(x, "Drawing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGalleryItemType(value: Double): Self = StObject.set(x, "GalleryItemType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGraphic(value: XGraphic): Self = StObject.set(x, "Graphic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThumbnail(value: XGraphic): Self = StObject.set(x, "Thumbnail", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "Title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setURL(value: String): Self = StObject.set(x, "URL", value.asInstanceOf[js.Any])
    }
  }
  
  object GalleryItemType {
    
    /* Rewritten from type alias, can be one of: 
      - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`3`
      - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`0`
      - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`1`
      - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`2`
    */
    trait Constants extends StObject
    object Constants {
      
      @scala.inline
      def DRAWING: `3` = 3.asInstanceOf[`3`]
      
      @scala.inline
      def EMPTY: `0` = 0.asInstanceOf[`0`]
      
      @scala.inline
      def GRAPHIC: `1` = 1.asInstanceOf[`1`]
      
      @scala.inline
      def MEDIA: `2` = 2.asInstanceOf[`2`]
    }
  }
  
  /**
    * provides access to a container of Gallery items and makes it possible for you to manipulate them.
    * @see XGalleryTheme
    */
  type GalleryTheme = XGalleryTheme
  
  /**
    * provides access to a container of GalleryThemes and makes it possible for you to manipulate them.
    * @see XGalleryThemeProvider
    */
  @js.native
  trait GalleryThemeProvider
    extends XGalleryThemeProvider
       with XInitialization
  object GalleryThemeProvider {
    
    @scala.inline
    def apply(
      ElementNames: SafeArray[String],
      ElementType: `type`,
      acquire: () => Unit,
      getByName: String => js.Any,
      getElementNames: () => SafeArray[String],
      getElementType: () => `type`,
      hasByName: String => Boolean,
      hasElements: () => Boolean,
      initialize: SeqEquiv[_] => Unit,
      insertNewByName: String => XGalleryTheme,
      queryInterface: `type` => js.Any,
      release: () => Unit,
      removeByName: String => Unit
    ): GalleryThemeProvider = {
      val __obj = js.Dynamic.literal(ElementNames = ElementNames.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getByName = js.Any.fromFunction1(getByName), getElementNames = js.Any.fromFunction0(getElementNames), getElementType = js.Any.fromFunction0(getElementType), hasByName = js.Any.fromFunction1(hasByName), hasElements = js.Any.fromFunction0(hasElements), initialize = js.Any.fromFunction1(initialize), insertNewByName = js.Any.fromFunction1(insertNewByName), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeByName = js.Any.fromFunction1(removeByName))
      __obj.asInstanceOf[GalleryThemeProvider]
    }
  }
  
  /** provides access to a single item of a Gallery theme. */
  @js.native
  trait XGalleryItem extends XInterface {
    
    /**
      * retrieves the type of the Gallery item
      * @returns The type of the Gallery item
      * @see GalleryItemType
      */
    val Type: Double = js.native
    
    /**
      * retrieves the type of the Gallery item
      * @returns The type of the Gallery item
      * @see GalleryItemType
      */
    def getType(): Double = js.native
  }
  object XGalleryItem {
    
    @scala.inline
    def apply(
      Type: Double,
      acquire: () => Unit,
      getType: () => Double,
      queryInterface: `type` => js.Any,
      release: () => Unit
    ): XGalleryItem = {
      val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getType = js.Any.fromFunction0(getType), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
      __obj.asInstanceOf[XGalleryItem]
    }
    
    @scala.inline
    implicit class XGalleryItemMutableBuilder[Self <: XGalleryItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetType(value: () => Double): Self = StObject.set(x, "getType", js.Any.fromFunction0(value))
      
      @scala.inline
      def setType(value: Double): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * provides access to the items of a Gallery themes. It also allows inserting and removing of single items.
    *
    * This interface extends the interface {@link com.sun.star.container.XIndexAccess} which provides access to existing Gallery items collection.
    * @see com.sun.star.container.XIndexAccess
    * @see com.sun.star.sheet.DataPilotTable
    */
  @js.native
  trait XGalleryTheme extends XIndexAccess {
    
    /**
      * retrieves the name of the Gallery theme
      * @returns The name of the Gallery theme
      */
    val Name: String = js.native
    
    /**
      * retrieves the name of the Gallery theme
      * @returns The name of the Gallery theme
      */
    def getName(): String = js.native
    
    /**
      * inserts an item
      * @param Drawing A drawing model that should be added to the collection
      * @param Index The zero based index of the position where to insert the new object inside the collection. If the index is larger than or equal to the numb
      * @returns The zero based position at which the object was inserted. If the object could not be inserted, -1 is returned.
      * @see XGalleryItem
      * @see com.sun.star.lang.WrappedTargetException
      */
    def insertDrawingByIndex(Drawing: XComponent, Index: Double): Double = js.native
    
    /**
      * inserts an item
      * @param Graphic The {@link com.sun.star.graphic.XGraphic} object that should be added to the collection
      * @param Index The zero based index of the position where to insert the new object inside the collection. If the index is larger than or equal to the numb
      * @returns The zero based position at which the object was inserted. If the object could not be inserted, -1 is returned.
      * @see com.sun.star.graphic.XGraphic
      * @see XGalleryItem
      * @see com.sun.star.lang.WrappedTargetException
      */
    def insertGraphicByIndex(Graphic: XGraphic, Index: Double): Double = js.native
    
    /**
      * inserts an item
      * @param URL The URL of a graphic or media object, that should be added to the collection
      * @param Index The zero based index of the position where to insert the new object inside the collection. If the index is larger than or equal to the numb
      * @returns The zero based position at which the object was inserted. If the object could not be inserted, -1 is returned.
      * @see XGalleryItem
      * @see com.sun.star.lang.WrappedTargetException
      */
    def insertURLByIndex(URL: String, Index: Double): Double = js.native
    
    /**
      * deletes an item from the collection
      * @param Index The position of the item to be removed. The position is zero based.
      * @see com.sun.star.container.NoSuchElementException
      */
    def removeByIndex(Index: Double): Unit = js.native
    
    /**
      * updates the theme
      *
      * This method iterates over each item of the Gallery theme and updates it accordingly. Main purpose is to automatically regenerate the thumbnails and to
      * remove invalid items, that is items who have got an URL that has become invalid. This method also optimizes underlying data structures.
      */
    def update(): Unit = js.native
  }
  object XGalleryTheme {
    
    @scala.inline
    def apply(
      Count: Double,
      ElementType: `type`,
      Name: String,
      acquire: () => Unit,
      getByIndex: Double => js.Any,
      getCount: () => Double,
      getElementType: () => `type`,
      getName: () => String,
      hasElements: () => Boolean,
      insertDrawingByIndex: (XComponent, Double) => Double,
      insertGraphicByIndex: (XGraphic, Double) => Double,
      insertURLByIndex: (String, Double) => Double,
      queryInterface: `type` => js.Any,
      release: () => Unit,
      removeByIndex: Double => Unit,
      update: () => Unit
    ): XGalleryTheme = {
      val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getByIndex = js.Any.fromFunction1(getByIndex), getCount = js.Any.fromFunction0(getCount), getElementType = js.Any.fromFunction0(getElementType), getName = js.Any.fromFunction0(getName), hasElements = js.Any.fromFunction0(hasElements), insertDrawingByIndex = js.Any.fromFunction2(insertDrawingByIndex), insertGraphicByIndex = js.Any.fromFunction2(insertGraphicByIndex), insertURLByIndex = js.Any.fromFunction2(insertURLByIndex), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeByIndex = js.Any.fromFunction1(removeByIndex), update = js.Any.fromFunction0(update))
      __obj.asInstanceOf[XGalleryTheme]
    }
    
    @scala.inline
    implicit class XGalleryThemeMutableBuilder[Self <: XGalleryTheme] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetName(value: () => String): Self = StObject.set(x, "getName", js.Any.fromFunction0(value))
      
      @scala.inline
      def setInsertDrawingByIndex(value: (XComponent, Double) => Double): Self = StObject.set(x, "insertDrawingByIndex", js.Any.fromFunction2(value))
      
      @scala.inline
      def setInsertGraphicByIndex(value: (XGraphic, Double) => Double): Self = StObject.set(x, "insertGraphicByIndex", js.Any.fromFunction2(value))
      
      @scala.inline
      def setInsertURLByIndex(value: (String, Double) => Double): Self = StObject.set(x, "insertURLByIndex", js.Any.fromFunction2(value))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveByIndex(value: Double => Unit): Self = StObject.set(x, "removeByIndex", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUpdate(value: () => Unit): Self = StObject.set(x, "update", js.Any.fromFunction0(value))
    }
  }
  
  /**
    * provides access to the Gallery themes. It also allows inserting and removing of Gallery themes by name.
    *
    * This interface extends the interface {@link com.sun.star.container.XNameAccess} which provides access to existing Gallery themes collection.
    * @see com.sun.star.container.XNameAccess
    */
  @js.native
  trait XGalleryThemeProvider extends XNameAccess {
    
    /**
      * creates a new Gallery theme and adds it to the collection.
      * @param ThemeName The name of the Gallery theme to be added to the collection. The name must be unique.
      * @returns {@link XGalleryTheme} The created theme interface
      * @see com.sun.star.container.ElementExistException
      */
    def insertNewByName(ThemeName: String): XGalleryTheme = js.native
    
    /**
      * deletes a Gallery theme from the collection.
      * @param ThemeName The name of the Gallery theme to be removed. The theme with the given name must exist.
      * @see com.sun.star.container.NoSuchElementException
      */
    def removeByName(ThemeName: String): Unit = js.native
  }
  object XGalleryThemeProvider {
    
    @scala.inline
    def apply(
      ElementNames: SafeArray[String],
      ElementType: `type`,
      acquire: () => Unit,
      getByName: String => js.Any,
      getElementNames: () => SafeArray[String],
      getElementType: () => `type`,
      hasByName: String => Boolean,
      hasElements: () => Boolean,
      insertNewByName: String => XGalleryTheme,
      queryInterface: `type` => js.Any,
      release: () => Unit,
      removeByName: String => Unit
    ): XGalleryThemeProvider = {
      val __obj = js.Dynamic.literal(ElementNames = ElementNames.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getByName = js.Any.fromFunction1(getByName), getElementNames = js.Any.fromFunction0(getElementNames), getElementType = js.Any.fromFunction0(getElementType), hasByName = js.Any.fromFunction1(hasByName), hasElements = js.Any.fromFunction0(hasElements), insertNewByName = js.Any.fromFunction1(insertNewByName), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeByName = js.Any.fromFunction1(removeByName))
      __obj.asInstanceOf[XGalleryThemeProvider]
    }
    
    @scala.inline
    implicit class XGalleryThemeProviderMutableBuilder[Self <: XGalleryThemeProvider] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInsertNewByName(value: String => XGalleryTheme): Self = StObject.set(x, "insertNewByName", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRemoveByName(value: String => Unit): Self = StObject.set(x, "removeByName", js.Any.fromFunction1(value))
    }
  }
}
