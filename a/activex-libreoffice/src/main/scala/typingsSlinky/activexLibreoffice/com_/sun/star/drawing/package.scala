package typingsSlinky.activexLibreoffice.com_.sun.star

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object drawing {
  
  /**
    * this service provides the properties to describe a background filling for a drawing page. It can be obtained by the {@link
    * com.sun.star.lang.XMultiServiceFactory} of a document and be set on draw pages that support a filled background.
    */
  type Background = typingsSlinky.activexLibreoffice.com_.sun.star.drawing.FillProperties
  
  /**
    * this is a container for URLs to bitmaps.
    *
    * It is used for example to access the bitmaps that are used inside a document for filling.
    * @see DrawingDocumentFactory
    * @see FillStyle.FillBitmapURL
    */
  type BitmapTable = typingsSlinky.activexLibreoffice.com_.sun.star.container.XNameContainer
  
  /** @since LibreOffice 4.1 */
  type ColorTable = typingsSlinky.activexLibreoffice.com_.sun.star.container.XNameContainer
  
  type CoordinateSequence = typingsSlinky.activexLibreoffice.LibreOffice.SeqEquiv[scala.Double]
  
  type CoordinateSequenceSequence = typingsSlinky.activexLibreoffice.LibreOffice.SeqEquiv[typingsSlinky.activexLibreoffice.com_.sun.star.drawing.CoordinateSequence]
  
  /**
    * this is a container for LineDashs
    *
    * It is used for example to access the LineDashs that are used inside a document.
    * @see DrawingDocumentFactory
    * @see LineDash
    */
  type DashTable = typingsSlinky.activexLibreoffice.com_.sun.star.container.XNameContainer
  
  type DoubleSequence = typingsSlinky.activexLibreoffice.LibreOffice.SeqEquiv[scala.Double]
  
  type DoubleSequenceSequence = typingsSlinky.activexLibreoffice.LibreOffice.SeqEquiv[typingsSlinky.activexLibreoffice.com_.sun.star.drawing.DoubleSequence]
  
  /** specifies a document which consists of multiple pages with drawings. */
  type DrawingDocument = typingsSlinky.activexLibreoffice.com_.sun.star.drawing.GenericDrawingDocument
  
  /** @deprecated DeprecatedPleas use the factory interface of the service GenericDrawingDocument. */
  type DrawingDocumentFactory = typingsSlinky.activexLibreoffice.com_.sun.star.lang.XMultiServiceFactory
  
  type FlagSequence = typingsSlinky.activexLibreoffice.LibreOffice.SeqEquiv[typingsSlinky.activexLibreoffice.com_.sun.star.drawing.PolygonFlags]
  
  type FlagSequenceSequence = typingsSlinky.activexLibreoffice.LibreOffice.SeqEquiv[typingsSlinky.activexLibreoffice.com_.sun.star.drawing.FlagSequence]
  
  /**
    * this is a container for com::sun::star::awt::Gradients
    *
    * It is used for example to access the com::sun::star::awt::Gradients that are used inside a document.
    * @see DrawingDocumentFactory
    * @see com.sun.star.awt.Gradient
    */
  type GradientTable = typingsSlinky.activexLibreoffice.com_.sun.star.container.XNameContainer
  
  /**
    * a component that supports this service lets you export pages, shapes, or groups of shapes from a {@link DrawingDocument} to a file in one of the file
    * formats supported by the component.
    */
  type GraphicExportFilter = typingsSlinky.activexLibreoffice.com_.sun.star.drawing.XGraphicExportFilter
  
  /**
    * this is a container for Hatchs
    *
    * It is used for example to access the Hatchs that are used inside a document.
    * @see DrawingDocumentFactory
    * @see Hatch
    */
  type HatchTable = typingsSlinky.activexLibreoffice.com_.sun.star.container.XNameContainer
  
  /**
    * this is a container for PointSequences
    *
    * It is used for example to access the line ends that are used inside a document.
    * @see DrawingDocumentFactory
    * @see PointSequence
    */
  type MarkerTable = typingsSlinky.activexLibreoffice.com_.sun.star.container.XNameContainer
  
  /**
    * This service is a single master page inside a drawing document.
    *
    * It serves as a background page for zero or more {@link DrawPages} . Since this service is derived from the service {@link GenericDrawPage} , it can be
    * used as a draw page with three differences:
    *
    *  1. It is not linked to any other {@link MasterPage} . 2. It cannot be removed from a document as long as one or more instances of {@link DrawPage}
    * are linked to it. 3. Modifications to a {@link MasterPage} are instantly visible on every {@link DrawPage} that is linked to it.
    */
  type MasterPage = typingsSlinky.activexLibreoffice.com_.sun.star.drawing.GenericDrawPage
  
  /**
    * provides access to a container of {@link MasterPages} and makes it possible for them to be manipulated.
    * @see XMasterPagesSupplier
    * @see DrawingDocument
    */
  type MasterPages = typingsSlinky.activexLibreoffice.com_.sun.star.drawing.XDrawPages
  
  /** @since LibreOffice 4.1 */
  type ModuleDispatcher = typingsSlinky.activexLibreoffice.com_.sun.star.frame.XDispatchProvider
  
  type PointSequence = typingsSlinky.activexLibreoffice.LibreOffice.SeqEquiv[typingsSlinky.activexLibreoffice.com_.sun.star.awt.Point]
  
  type PointSequenceSequence = typingsSlinky.activexLibreoffice.LibreOffice.SeqEquiv[typingsSlinky.activexLibreoffice.com_.sun.star.drawing.PointSequence]
  
  /**
    * This service describes a generic container to manage collections of {@link Shape} . The {@link Shape} that are added to this collection are not owned
    * by the collection.
    *
    * This service is used by the view f.e. to return a collection of {@link Shape} that are selected at the ui.
    */
  type ShapeCollection = typingsSlinky.activexLibreoffice.com_.sun.star.drawing.XShapes
  
  /** This service is for a generic collection of shapes. */
  type Shapes = typingsSlinky.activexLibreoffice.com_.sun.star.drawing.XShapes
  
  /**
    * this is a container for com::sun::star::awt::Gradients
    *
    * It is used for example to access the com::sun::star::awt::Gradients that are used inside a document for fill transparency.
    * @see DrawingDocumentFactory
    * @see com.sun.star.awt.Gradient
    */
  type TransparencyGradientTable = typingsSlinky.activexLibreoffice.com_.sun.star.container.XNameContainer
  
  /** identifies an {@link XShapes} as a {@link DrawPage} . */
  type XDrawPage = typingsSlinky.activexLibreoffice.com_.sun.star.drawing.XShapes
  
  /** identifies the object as a {@link Layer} . */
  type XLayer = typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertySet
}
