package typingsSlinky.activexLibreoffice.com_.sun.star

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XFastPropertySet
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typingsSlinky.activexLibreoffice.com_.sun.star.geometry.RealPoint2D
import typingsSlinky.activexLibreoffice.com_.sun.star.geometry.RealSize2D
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.XComponent
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.XEventListener
import typingsSlinky.activexLibreoffice.com_.sun.star.text.XText
import typingsSlinky.activexLibreoffice.com_.sun.star.util.DateTime
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object office {
  
  /** @since LibreOffice 4.2 */
  @js.native
  trait Quickstart extends XFastPropertySet {
    
    /** The first two parameters are ignored */
    def createAndSetVeto(p1: Boolean, p2: Boolean, DisableVeto: Boolean): Unit = js.native
    
    def createAutoStart(bQuickstart: Boolean, bAutostart: Boolean): Unit = js.native
    
    def createDefault(): Unit = js.native
    
    def createStart(bQuickstart: Boolean): Unit = js.native
  }
  object Quickstart {
    
    @scala.inline
    def apply(
      acquire: () => Unit,
      createAndSetVeto: (Boolean, Boolean, Boolean) => Unit,
      createAutoStart: (Boolean, Boolean) => Unit,
      createDefault: () => Unit,
      createStart: Boolean => Unit,
      getFastPropertyValue: Double => js.Any,
      queryInterface: `type` => js.Any,
      release: () => Unit,
      setFastPropertyValue: (Double, js.Any) => Unit
    ): Quickstart = {
      val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createAndSetVeto = js.Any.fromFunction3(createAndSetVeto), createAutoStart = js.Any.fromFunction2(createAutoStart), createDefault = js.Any.fromFunction0(createDefault), createStart = js.Any.fromFunction1(createStart), getFastPropertyValue = js.Any.fromFunction1(getFastPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setFastPropertyValue = js.Any.fromFunction2(setFastPropertyValue))
      __obj.asInstanceOf[Quickstart]
    }
    
    @scala.inline
    implicit class QuickstartMutableBuilder[Self <: Quickstart] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreateAndSetVeto(value: (Boolean, Boolean, Boolean) => Unit): Self = StObject.set(x, "createAndSetVeto", js.Any.fromFunction3(value))
      
      @scala.inline
      def setCreateAutoStart(value: (Boolean, Boolean) => Unit): Self = StObject.set(x, "createAutoStart", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCreateDefault(value: () => Unit): Self = StObject.set(x, "createDefault", js.Any.fromFunction0(value))
      
      @scala.inline
      def setCreateStart(value: Boolean => Unit): Self = StObject.set(x, "createStart", js.Any.fromFunction1(value))
    }
  }
  
  /** This interface gives access to an annotation inside a document. */
  @js.native
  trait XAnnotation
    extends XPropertySet
       with XComponent {
    
    /** a reference to the document content this annotation is anchored to. */
    var Anchor: js.Any = js.native
    
    /** stores the full name of the author who created this annotation. */
    var Author: String = js.native
    
    /** stores the date and time this annotation was last edited. */
    var DateTime: typingsSlinky.activexLibreoffice.com_.sun.star.util.DateTime = js.native
    
    /** stores the initials of the author who created this annotation. */
    var Initials: String = js.native
    
    /**
      * this is an optional position that gives the user interface a hint where the annotation should be rendered. This could be an offset to the annotations
      * anchor.
      */
    var Position: RealPoint2D = js.native
    
    /** this is an optional size that gives the user interface a hint how large the annotation should be rendered. */
    var Size: RealSize2D = js.native
    
    /** gives access to the annotations text. */
    var TextRange: XText = js.native
  }
  object XAnnotation {
    
    @scala.inline
    def apply(
      Anchor: js.Any,
      Author: String,
      DateTime: DateTime,
      Initials: String,
      Position: RealPoint2D,
      PropertySetInfo: XPropertySetInfo,
      Size: RealSize2D,
      TextRange: XText,
      acquire: () => Unit,
      addEventListener: XEventListener => Unit,
      addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
      addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
      dispose: () => Unit,
      getPropertySetInfo: () => XPropertySetInfo,
      getPropertyValue: String => js.Any,
      queryInterface: `type` => js.Any,
      release: () => Unit,
      removeEventListener: XEventListener => Unit,
      removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
      removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
      setPropertyValue: (String, js.Any) => Unit
    ): XAnnotation = {
      val __obj = js.Dynamic.literal(Anchor = Anchor.asInstanceOf[js.Any], Author = Author.asInstanceOf[js.Any], DateTime = DateTime.asInstanceOf[js.Any], Initials = Initials.asInstanceOf[js.Any], Position = Position.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], TextRange = TextRange.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), dispose = js.Any.fromFunction0(dispose), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
      __obj.asInstanceOf[XAnnotation]
    }
    
    @scala.inline
    implicit class XAnnotationMutableBuilder[Self <: XAnnotation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnchor(value: js.Any): Self = StObject.set(x, "Anchor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthor(value: String): Self = StObject.set(x, "Author", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateTime(value: DateTime): Self = StObject.set(x, "DateTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitials(value: String): Self = StObject.set(x, "Initials", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPosition(value: RealPoint2D): Self = StObject.set(x, "Position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSize(value: RealSize2D): Self = StObject.set(x, "Size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextRange(value: XText): Self = StObject.set(x, "TextRange", value.asInstanceOf[js.Any])
    }
  }
  
  /** This interface gives access to the annotation for a document content. */
  @js.native
  trait XAnnotationAccess extends StObject {
    
    /** creates a new annotation and inserts it into the document content. */
    def createAndInsertAnnotation(): XAnnotation = js.native
    
    /** @returns a new enumeration object for this annotation container. It returns NULL if there are no objects in this container. */
    def createAnnotationEnumeration(): XAnnotationEnumeration = js.native
    
    /** removes the annotation from this document content. */
    def removeAnnotation(annotation: XAnnotation): Unit = js.native
  }
  object XAnnotationAccess {
    
    @scala.inline
    def apply(
      createAndInsertAnnotation: () => XAnnotation,
      createAnnotationEnumeration: () => XAnnotationEnumeration,
      removeAnnotation: XAnnotation => Unit
    ): XAnnotationAccess = {
      val __obj = js.Dynamic.literal(createAndInsertAnnotation = js.Any.fromFunction0(createAndInsertAnnotation), createAnnotationEnumeration = js.Any.fromFunction0(createAnnotationEnumeration), removeAnnotation = js.Any.fromFunction1(removeAnnotation))
      __obj.asInstanceOf[XAnnotationAccess]
    }
    
    @scala.inline
    implicit class XAnnotationAccessMutableBuilder[Self <: XAnnotationAccess] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreateAndInsertAnnotation(value: () => XAnnotation): Self = StObject.set(x, "createAndInsertAnnotation", js.Any.fromFunction0(value))
      
      @scala.inline
      def setCreateAnnotationEnumeration(value: () => XAnnotationEnumeration): Self = StObject.set(x, "createAnnotationEnumeration", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRemoveAnnotation(value: XAnnotation => Unit): Self = StObject.set(x, "removeAnnotation", js.Any.fromFunction1(value))
    }
  }
  
  /** An enumeration for a set of annotations. */
  @js.native
  trait XAnnotationEnumeration extends StObject {
    
    /** tests whether this enumeration contains more elements. */
    def hasMoreElements(): Boolean = js.native
    
    /**
      * @returns the next element of this enumeration.
      * @throws NoSuchElementException if no more elements exist.
      */
    def nextElement(): XAnnotation = js.native
  }
  object XAnnotationEnumeration {
    
    @scala.inline
    def apply(hasMoreElements: () => Boolean, nextElement: () => XAnnotation): XAnnotationEnumeration = {
      val __obj = js.Dynamic.literal(hasMoreElements = js.Any.fromFunction0(hasMoreElements), nextElement = js.Any.fromFunction0(nextElement))
      __obj.asInstanceOf[XAnnotationEnumeration]
    }
    
    @scala.inline
    implicit class XAnnotationEnumerationMutableBuilder[Self <: XAnnotationEnumeration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHasMoreElements(value: () => Boolean): Self = StObject.set(x, "hasMoreElements", js.Any.fromFunction0(value))
      
      @scala.inline
      def setNextElement(value: () => XAnnotation): Self = StObject.set(x, "nextElement", js.Any.fromFunction0(value))
    }
  }
}
