package typingsSlinky.pdfkit

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable5
import typingsSlinky.node.Buffer
import typingsSlinky.node.NodeJS.ReadableStream
import typingsSlinky.pdfkit.PDFKit.Mixins.PDFAnnotation
import typingsSlinky.pdfkit.PDFKit.Mixins.PDFColor
import typingsSlinky.pdfkit.PDFKit.Mixins.PDFFont
import typingsSlinky.pdfkit.PDFKit.Mixins.PDFImage
import typingsSlinky.pdfkit.PDFKit.Mixins.PDFText
import typingsSlinky.pdfkit.PDFKit.Mixins.PDFVector
import typingsSlinky.pdfkit.anon.Annots
import typingsSlinky.pdfkit.anon.Bottom
import typingsSlinky.pdfkit.anon.Count
import typingsSlinky.pdfkit.anon.Origin
import typingsSlinky.pdfkit.pdfkitStrings.`1Dot3`
import typingsSlinky.pdfkit.pdfkitStrings.`1Dot4`
import typingsSlinky.pdfkit.pdfkitStrings.`1Dot5`
import typingsSlinky.pdfkit.pdfkitStrings.`1Dot6`
import typingsSlinky.pdfkit.pdfkitStrings.`1Dot7`
import typingsSlinky.pdfkit.pdfkitStrings.`1Dot7ext3`
import typingsSlinky.pdfkit.pdfkitStrings.`svg-central`
import typingsSlinky.pdfkit.pdfkitStrings.`svg-middle`
import typingsSlinky.pdfkit.pdfkitStrings.alphabetic
import typingsSlinky.pdfkit.pdfkitStrings.bottom
import typingsSlinky.pdfkit.pdfkitStrings.center
import typingsSlinky.pdfkit.pdfkitStrings.hanging
import typingsSlinky.pdfkit.pdfkitStrings.highResolution
import typingsSlinky.pdfkit.pdfkitStrings.ideographic
import typingsSlinky.pdfkit.pdfkitStrings.justify
import typingsSlinky.pdfkit.pdfkitStrings.landscape
import typingsSlinky.pdfkit.pdfkitStrings.left
import typingsSlinky.pdfkit.pdfkitStrings.lowResolution
import typingsSlinky.pdfkit.pdfkitStrings.mathematical
import typingsSlinky.pdfkit.pdfkitStrings.middle
import typingsSlinky.pdfkit.pdfkitStrings.portrait
import typingsSlinky.pdfkit.pdfkitStrings.right
import typingsSlinky.pdfkit.pdfkitStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PDFKit {
  
  @js.native
  trait DocumentInfo extends StObject {
    
    var Author: js.UndefOr[String] = js.native
    
    var CreationDate: js.UndefOr[js.Date] = js.native
    
    var Creator: js.UndefOr[String] = js.native
    
    var Keywords: js.UndefOr[String] = js.native
    
    var ModDate: js.UndefOr[js.Date] = js.native
    
    var Producer: js.UndefOr[String] = js.native
    
    var Title: js.UndefOr[String] = js.native
  }
  object DocumentInfo {
    
    @scala.inline
    def apply(): DocumentInfo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DocumentInfo]
    }
    
    @scala.inline
    implicit class DocumentInfoMutableBuilder[Self <: DocumentInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthor(value: String): Self = StObject.set(x, "Author", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthorUndefined: Self = StObject.set(x, "Author", js.undefined)
      
      @scala.inline
      def setCreationDate(value: js.Date): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreationDateUndefined: Self = StObject.set(x, "CreationDate", js.undefined)
      
      @scala.inline
      def setCreator(value: String): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreatorUndefined: Self = StObject.set(x, "Creator", js.undefined)
      
      @scala.inline
      def setKeywords(value: String): Self = StObject.set(x, "Keywords", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeywordsUndefined: Self = StObject.set(x, "Keywords", js.undefined)
      
      @scala.inline
      def setModDate(value: js.Date): Self = StObject.set(x, "ModDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModDateUndefined: Self = StObject.set(x, "ModDate", js.undefined)
      
      @scala.inline
      def setProducer(value: String): Self = StObject.set(x, "Producer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProducerUndefined: Self = StObject.set(x, "Producer", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "Title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "Title", js.undefined)
    }
  }
  
  @js.native
  trait DocumentPermissions extends StObject {
    
    var annotating: js.UndefOr[Boolean] = js.native
    
    var contentAccessibility: js.UndefOr[Boolean] = js.native
    
    var copying: js.UndefOr[Boolean] = js.native
    
    var documentAssembly: js.UndefOr[Boolean] = js.native
    
    var fillingForms: js.UndefOr[Boolean] = js.native
    
    var modifying: js.UndefOr[Boolean] = js.native
    
    var printing: js.UndefOr[lowResolution | highResolution] = js.native
  }
  object DocumentPermissions {
    
    @scala.inline
    def apply(): DocumentPermissions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DocumentPermissions]
    }
    
    @scala.inline
    implicit class DocumentPermissionsMutableBuilder[Self <: DocumentPermissions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnnotating(value: Boolean): Self = StObject.set(x, "annotating", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnnotatingUndefined: Self = StObject.set(x, "annotating", js.undefined)
      
      @scala.inline
      def setContentAccessibility(value: Boolean): Self = StObject.set(x, "contentAccessibility", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentAccessibilityUndefined: Self = StObject.set(x, "contentAccessibility", js.undefined)
      
      @scala.inline
      def setCopying(value: Boolean): Self = StObject.set(x, "copying", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCopyingUndefined: Self = StObject.set(x, "copying", js.undefined)
      
      @scala.inline
      def setDocumentAssembly(value: Boolean): Self = StObject.set(x, "documentAssembly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDocumentAssemblyUndefined: Self = StObject.set(x, "documentAssembly", js.undefined)
      
      @scala.inline
      def setFillingForms(value: Boolean): Self = StObject.set(x, "fillingForms", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillingFormsUndefined: Self = StObject.set(x, "fillingForms", js.undefined)
      
      @scala.inline
      def setModifying(value: Boolean): Self = StObject.set(x, "modifying", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModifyingUndefined: Self = StObject.set(x, "modifying", js.undefined)
      
      @scala.inline
      def setPrinting(value: lowResolution | highResolution): Self = StObject.set(x, "printing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrintingUndefined: Self = StObject.set(x, "printing", js.undefined)
    }
  }
  
  object Mixins {
    
    @js.native
    trait AnnotationOption extends StObject {
      
      var A: js.UndefOr[js.Any] = js.native
      
      var B: js.UndefOr[js.Any] = js.native
      
      var Border: js.UndefOr[js.Array[Double]] = js.native
      
      var C: js.UndefOr[js.Any] = js.native
      
      var Contents: js.UndefOr[String] = js.native
      
      var DA: js.UndefOr[String] = js.native
      
      var L: js.UndefOr[js.Any] = js.native
      
      var Name: js.UndefOr[String] = js.native
      
      var QuadPoints: js.UndefOr[js.Array[Double]] = js.native
      
      var Rect: js.UndefOr[js.Any] = js.native
      
      var SubType: js.UndefOr[String] = js.native
      
      var Type: js.UndefOr[String] = js.native
      
      var color: js.UndefOr[String] = js.native
    }
    object AnnotationOption {
      
      @scala.inline
      def apply(): AnnotationOption = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[AnnotationOption]
      }
      
      @scala.inline
      implicit class AnnotationOptionMutableBuilder[Self <: AnnotationOption] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setA(value: js.Any): Self = StObject.set(x, "A", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAUndefined: Self = StObject.set(x, "A", js.undefined)
        
        @scala.inline
        def setB(value: js.Any): Self = StObject.set(x, "B", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBUndefined: Self = StObject.set(x, "B", js.undefined)
        
        @scala.inline
        def setBorder(value: js.Array[Double]): Self = StObject.set(x, "Border", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBorderUndefined: Self = StObject.set(x, "Border", js.undefined)
        
        @scala.inline
        def setBorderVarargs(value: Double*): Self = StObject.set(x, "Border", js.Array(value :_*))
        
        @scala.inline
        def setC(value: js.Any): Self = StObject.set(x, "C", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCUndefined: Self = StObject.set(x, "C", js.undefined)
        
        @scala.inline
        def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
        
        @scala.inline
        def setContents(value: String): Self = StObject.set(x, "Contents", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setContentsUndefined: Self = StObject.set(x, "Contents", js.undefined)
        
        @scala.inline
        def setDA(value: String): Self = StObject.set(x, "DA", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDAUndefined: Self = StObject.set(x, "DA", js.undefined)
        
        @scala.inline
        def setL(value: js.Any): Self = StObject.set(x, "L", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLUndefined: Self = StObject.set(x, "L", js.undefined)
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
        
        @scala.inline
        def setQuadPoints(value: js.Array[Double]): Self = StObject.set(x, "QuadPoints", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setQuadPointsUndefined: Self = StObject.set(x, "QuadPoints", js.undefined)
        
        @scala.inline
        def setQuadPointsVarargs(value: Double*): Self = StObject.set(x, "QuadPoints", js.Array(value :_*))
        
        @scala.inline
        def setRect(value: js.Any): Self = StObject.set(x, "Rect", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRectUndefined: Self = StObject.set(x, "Rect", js.undefined)
        
        @scala.inline
        def setSubType(value: String): Self = StObject.set(x, "SubType", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSubTypeUndefined: Self = StObject.set(x, "SubType", js.undefined)
        
        @scala.inline
        def setType(value: String): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
      }
    }
    
    // The color forms accepted by PDFKit:
    //     example:   "red"                  [R, G, B]                  [C, M, Y, K]
    type ColorValue = String | PDFGradient | (js.Tuple3[Double, Double, Double]) | (js.Tuple4[Double, Double, Double, Double])
    
    @js.native
    trait ImageOption extends StObject {
      
      var align: js.UndefOr[center | right] = js.native
      
      var cover: js.UndefOr[js.Tuple2[Double, Double]] = js.native
      
      var destination: js.UndefOr[String] = js.native
      
      /** Two elements array specifying dimensions(w,h)  */
      var fit: js.UndefOr[js.Tuple2[Double, Double]] = js.native
      
      var goTo: js.UndefOr[AnnotationOption] = js.native
      
      var height: js.UndefOr[Double] = js.native
      
      var link: js.UndefOr[AnnotationOption] = js.native
      
      /** Scale percentage */
      var scale: js.UndefOr[Double] = js.native
      
      var valign: js.UndefOr[center | bottom] = js.native
      
      var width: js.UndefOr[Double] = js.native
    }
    object ImageOption {
      
      @scala.inline
      def apply(): ImageOption = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ImageOption]
      }
      
      @scala.inline
      implicit class ImageOptionMutableBuilder[Self <: ImageOption] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAlign(value: center | right): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
        
        @scala.inline
        def setCover(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "cover", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCoverUndefined: Self = StObject.set(x, "cover", js.undefined)
        
        @scala.inline
        def setDestination(value: String): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDestinationUndefined: Self = StObject.set(x, "destination", js.undefined)
        
        @scala.inline
        def setFit(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "fit", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFitUndefined: Self = StObject.set(x, "fit", js.undefined)
        
        @scala.inline
        def setGoTo(value: AnnotationOption): Self = StObject.set(x, "goTo", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGoToUndefined: Self = StObject.set(x, "goTo", js.undefined)
        
        @scala.inline
        def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
        
        @scala.inline
        def setLink(value: AnnotationOption): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
        
        @scala.inline
        def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
        
        @scala.inline
        def setValign(value: center | bottom): Self = StObject.set(x, "valign", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setValignUndefined: Self = StObject.set(x, "valign", js.undefined)
        
        @scala.inline
        def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      }
    }
    
    // Text option opentype features as listed at https://docs.microsoft.com/en-us/typography/opentype/spec/featurelist
    /* Rewritten from type alias, can be one of: 
      - typingsSlinky.pdfkit.pdfkitStrings.aalt
      - typingsSlinky.pdfkit.pdfkitStrings.abvf
      - typingsSlinky.pdfkit.pdfkitStrings.abvm
      - typingsSlinky.pdfkit.pdfkitStrings.abvs
      - typingsSlinky.pdfkit.pdfkitStrings.afrc
      - typingsSlinky.pdfkit.pdfkitStrings.akhn
      - typingsSlinky.pdfkit.pdfkitStrings.blwf
      - typingsSlinky.pdfkit.pdfkitStrings.blwm
      - typingsSlinky.pdfkit.pdfkitStrings.blws
      - typingsSlinky.pdfkit.pdfkitStrings.calt
      - typingsSlinky.pdfkit.pdfkitStrings.`case`
      - typingsSlinky.pdfkit.pdfkitStrings.cfar
      - typingsSlinky.pdfkit.pdfkitStrings.cjct
      - typingsSlinky.pdfkit.pdfkitStrings.clig
      - typingsSlinky.pdfkit.pdfkitStrings.cpct
      - typingsSlinky.pdfkit.pdfkitStrings.cpsp
      - typingsSlinky.pdfkit.pdfkitStrings.cswh
      - typingsSlinky.pdfkit.pdfkitStrings.curs
      - typingsSlinky.pdfkit.pdfkitStrings.cv01
      - typingsSlinky.pdfkit.pdfkitStrings.cv02
      - typingsSlinky.pdfkit.pdfkitStrings.cv03
      - typingsSlinky.pdfkit.pdfkitStrings.cv04
      - typingsSlinky.pdfkit.pdfkitStrings.cv05
      - typingsSlinky.pdfkit.pdfkitStrings.cv06
      - typingsSlinky.pdfkit.pdfkitStrings.cv07
      - typingsSlinky.pdfkit.pdfkitStrings.cv08
      - typingsSlinky.pdfkit.pdfkitStrings.cv09
      - typingsSlinky.pdfkit.pdfkitStrings.cv10
      - typingsSlinky.pdfkit.pdfkitStrings.cv11
      - typingsSlinky.pdfkit.pdfkitStrings.cv12
      - typingsSlinky.pdfkit.pdfkitStrings.cv13
      - typingsSlinky.pdfkit.pdfkitStrings.cv14
      - typingsSlinky.pdfkit.pdfkitStrings.cv15
      - typingsSlinky.pdfkit.pdfkitStrings.cv16
      - typingsSlinky.pdfkit.pdfkitStrings.cv17
      - typingsSlinky.pdfkit.pdfkitStrings.cv18
      - typingsSlinky.pdfkit.pdfkitStrings.cv19
      - typingsSlinky.pdfkit.pdfkitStrings.cv20
      - typingsSlinky.pdfkit.pdfkitStrings.cv21
      - typingsSlinky.pdfkit.pdfkitStrings.cv22
      - typingsSlinky.pdfkit.pdfkitStrings.cv23
      - typingsSlinky.pdfkit.pdfkitStrings.cv24
      - typingsSlinky.pdfkit.pdfkitStrings.cv25
      - typingsSlinky.pdfkit.pdfkitStrings.cv26
      - typingsSlinky.pdfkit.pdfkitStrings.cv27
      - typingsSlinky.pdfkit.pdfkitStrings.cv28
      - typingsSlinky.pdfkit.pdfkitStrings.cv29
      - typingsSlinky.pdfkit.pdfkitStrings.cv30
      - typingsSlinky.pdfkit.pdfkitStrings.cv31
      - typingsSlinky.pdfkit.pdfkitStrings.cv32
      - typingsSlinky.pdfkit.pdfkitStrings.cv33
      - typingsSlinky.pdfkit.pdfkitStrings.cv34
      - typingsSlinky.pdfkit.pdfkitStrings.cv35
      - typingsSlinky.pdfkit.pdfkitStrings.cv36
      - typingsSlinky.pdfkit.pdfkitStrings.cv37
      - typingsSlinky.pdfkit.pdfkitStrings.cv38
      - typingsSlinky.pdfkit.pdfkitStrings.cv39
      - typingsSlinky.pdfkit.pdfkitStrings.cv40
      - typingsSlinky.pdfkit.pdfkitStrings.cv41
      - typingsSlinky.pdfkit.pdfkitStrings.cv42
      - typingsSlinky.pdfkit.pdfkitStrings.cv43
      - typingsSlinky.pdfkit.pdfkitStrings.cv44
      - typingsSlinky.pdfkit.pdfkitStrings.cv45
      - typingsSlinky.pdfkit.pdfkitStrings.cv46
      - typingsSlinky.pdfkit.pdfkitStrings.cv47
      - typingsSlinky.pdfkit.pdfkitStrings.cv48
      - typingsSlinky.pdfkit.pdfkitStrings.cv49
      - typingsSlinky.pdfkit.pdfkitStrings.cv50
      - typingsSlinky.pdfkit.pdfkitStrings.cv51
      - typingsSlinky.pdfkit.pdfkitStrings.cv52
      - typingsSlinky.pdfkit.pdfkitStrings.cv53
      - typingsSlinky.pdfkit.pdfkitStrings.cv54
      - typingsSlinky.pdfkit.pdfkitStrings.cv55
      - typingsSlinky.pdfkit.pdfkitStrings.cv56
      - typingsSlinky.pdfkit.pdfkitStrings.cv57
      - typingsSlinky.pdfkit.pdfkitStrings.cv58
      - typingsSlinky.pdfkit.pdfkitStrings.cv59
      - typingsSlinky.pdfkit.pdfkitStrings.cv60
      - typingsSlinky.pdfkit.pdfkitStrings.cv61
      - typingsSlinky.pdfkit.pdfkitStrings.cv62
      - typingsSlinky.pdfkit.pdfkitStrings.cv63
      - typingsSlinky.pdfkit.pdfkitStrings.cv64
      - typingsSlinky.pdfkit.pdfkitStrings.cv65
      - typingsSlinky.pdfkit.pdfkitStrings.cv66
      - typingsSlinky.pdfkit.pdfkitStrings.cv67
      - typingsSlinky.pdfkit.pdfkitStrings.cv68
      - typingsSlinky.pdfkit.pdfkitStrings.cv69
      - typingsSlinky.pdfkit.pdfkitStrings.cv70
      - typingsSlinky.pdfkit.pdfkitStrings.cv71
      - typingsSlinky.pdfkit.pdfkitStrings.cv72
      - typingsSlinky.pdfkit.pdfkitStrings.cv73
      - typingsSlinky.pdfkit.pdfkitStrings.cv74
      - typingsSlinky.pdfkit.pdfkitStrings.cv75
      - typingsSlinky.pdfkit.pdfkitStrings.cv76
      - typingsSlinky.pdfkit.pdfkitStrings.cv77
      - typingsSlinky.pdfkit.pdfkitStrings.cv78
      - typingsSlinky.pdfkit.pdfkitStrings.cv79
      - typingsSlinky.pdfkit.pdfkitStrings.cv80
      - typingsSlinky.pdfkit.pdfkitStrings.cv81
      - typingsSlinky.pdfkit.pdfkitStrings.cv82
      - typingsSlinky.pdfkit.pdfkitStrings.cv83
      - typingsSlinky.pdfkit.pdfkitStrings.cv84
      - typingsSlinky.pdfkit.pdfkitStrings.cv85
      - typingsSlinky.pdfkit.pdfkitStrings.cv86
      - typingsSlinky.pdfkit.pdfkitStrings.cv87
      - typingsSlinky.pdfkit.pdfkitStrings.cv88
      - typingsSlinky.pdfkit.pdfkitStrings.cv89
      - typingsSlinky.pdfkit.pdfkitStrings.cv90
      - typingsSlinky.pdfkit.pdfkitStrings.cv91
      - typingsSlinky.pdfkit.pdfkitStrings.cv92
      - typingsSlinky.pdfkit.pdfkitStrings.cv93
      - typingsSlinky.pdfkit.pdfkitStrings.cv94
      - typingsSlinky.pdfkit.pdfkitStrings.cv95
      - typingsSlinky.pdfkit.pdfkitStrings.cv96
      - typingsSlinky.pdfkit.pdfkitStrings.cv97
      - typingsSlinky.pdfkit.pdfkitStrings.cv98
      - typingsSlinky.pdfkit.pdfkitStrings.cv99
      - typingsSlinky.pdfkit.pdfkitStrings.c2pc
      - typingsSlinky.pdfkit.pdfkitStrings.c2sc
      - typingsSlinky.pdfkit.pdfkitStrings.dist
      - typingsSlinky.pdfkit.pdfkitStrings.ccmp
      - typingsSlinky.pdfkit.pdfkitStrings.dlig
      - typingsSlinky.pdfkit.pdfkitStrings.dnom
      - typingsSlinky.pdfkit.pdfkitStrings.dtls
      - typingsSlinky.pdfkit.pdfkitStrings.expt
      - typingsSlinky.pdfkit.pdfkitStrings.falt
      - typingsSlinky.pdfkit.pdfkitStrings.fin2
      - typingsSlinky.pdfkit.pdfkitStrings.fin3
      - typingsSlinky.pdfkit.pdfkitStrings.fina
      - typingsSlinky.pdfkit.pdfkitStrings.flac
      - typingsSlinky.pdfkit.pdfkitStrings.frac
      - typingsSlinky.pdfkit.pdfkitStrings.fwid
      - typingsSlinky.pdfkit.pdfkitStrings.half
      - typingsSlinky.pdfkit.pdfkitStrings.haln
      - typingsSlinky.pdfkit.pdfkitStrings.halt
      - typingsSlinky.pdfkit.pdfkitStrings.hist
      - typingsSlinky.pdfkit.pdfkitStrings.hkna
      - typingsSlinky.pdfkit.pdfkitStrings.hlig
      - typingsSlinky.pdfkit.pdfkitStrings.hngl
      - typingsSlinky.pdfkit.pdfkitStrings.hojo
      - typingsSlinky.pdfkit.pdfkitStrings.hwid
      - typingsSlinky.pdfkit.pdfkitStrings.init
      - typingsSlinky.pdfkit.pdfkitStrings.isol
      - typingsSlinky.pdfkit.pdfkitStrings.ital
      - typingsSlinky.pdfkit.pdfkitStrings.jalt
      - typingsSlinky.pdfkit.pdfkitStrings.jp78
      - typingsSlinky.pdfkit.pdfkitStrings.jp83
      - typingsSlinky.pdfkit.pdfkitStrings.jp90
      - typingsSlinky.pdfkit.pdfkitStrings.jp04
      - typingsSlinky.pdfkit.pdfkitStrings.kern
      - typingsSlinky.pdfkit.pdfkitStrings.lfbd
      - typingsSlinky.pdfkit.pdfkitStrings.liga
      - typingsSlinky.pdfkit.pdfkitStrings.ljmo
      - typingsSlinky.pdfkit.pdfkitStrings.lnum
      - typingsSlinky.pdfkit.pdfkitStrings.locl
      - typingsSlinky.pdfkit.pdfkitStrings.ltra
      - typingsSlinky.pdfkit.pdfkitStrings.ltrm
      - typingsSlinky.pdfkit.pdfkitStrings.mark
      - typingsSlinky.pdfkit.pdfkitStrings.med2
      - typingsSlinky.pdfkit.pdfkitStrings.medi
      - typingsSlinky.pdfkit.pdfkitStrings.mgrk
      - typingsSlinky.pdfkit.pdfkitStrings.mkmk
      - typingsSlinky.pdfkit.pdfkitStrings.mset
      - typingsSlinky.pdfkit.pdfkitStrings.nalt
      - typingsSlinky.pdfkit.pdfkitStrings.nlck
      - typingsSlinky.pdfkit.pdfkitStrings.nukt
      - typingsSlinky.pdfkit.pdfkitStrings.numr
      - typingsSlinky.pdfkit.pdfkitStrings.onum
      - typingsSlinky.pdfkit.pdfkitStrings.opbd
      - typingsSlinky.pdfkit.pdfkitStrings.ordn
      - typingsSlinky.pdfkit.pdfkitStrings.ornm
      - typingsSlinky.pdfkit.pdfkitStrings.palt
      - typingsSlinky.pdfkit.pdfkitStrings.pcap
      - typingsSlinky.pdfkit.pdfkitStrings.pkna
      - typingsSlinky.pdfkit.pdfkitStrings.pnum
      - typingsSlinky.pdfkit.pdfkitStrings.pref
      - typingsSlinky.pdfkit.pdfkitStrings.pres
      - typingsSlinky.pdfkit.pdfkitStrings.pstf
      - typingsSlinky.pdfkit.pdfkitStrings.psts
      - typingsSlinky.pdfkit.pdfkitStrings.pwid
      - typingsSlinky.pdfkit.pdfkitStrings.qwid
      - typingsSlinky.pdfkit.pdfkitStrings.rand
      - typingsSlinky.pdfkit.pdfkitStrings.rclt
      - typingsSlinky.pdfkit.pdfkitStrings.rkrf
      - typingsSlinky.pdfkit.pdfkitStrings.rlig
      - typingsSlinky.pdfkit.pdfkitStrings.rphf
      - typingsSlinky.pdfkit.pdfkitStrings.rtbd
      - typingsSlinky.pdfkit.pdfkitStrings.rtla
      - typingsSlinky.pdfkit.pdfkitStrings.rtlm
      - typingsSlinky.pdfkit.pdfkitStrings.ruby
      - typingsSlinky.pdfkit.pdfkitStrings.rvrn
      - typingsSlinky.pdfkit.pdfkitStrings.salt
      - typingsSlinky.pdfkit.pdfkitStrings.sinf
      - typingsSlinky.pdfkit.pdfkitStrings.size
      - typingsSlinky.pdfkit.pdfkitStrings.smcp
      - typingsSlinky.pdfkit.pdfkitStrings.smpl
      - typingsSlinky.pdfkit.pdfkitStrings.ss01
      - typingsSlinky.pdfkit.pdfkitStrings.ss02
      - typingsSlinky.pdfkit.pdfkitStrings.ss03
      - typingsSlinky.pdfkit.pdfkitStrings.ss04
      - typingsSlinky.pdfkit.pdfkitStrings.ss05
      - typingsSlinky.pdfkit.pdfkitStrings.ss06
      - typingsSlinky.pdfkit.pdfkitStrings.ss07
      - typingsSlinky.pdfkit.pdfkitStrings.ss08
      - typingsSlinky.pdfkit.pdfkitStrings.ss09
      - typingsSlinky.pdfkit.pdfkitStrings.ss10
      - typingsSlinky.pdfkit.pdfkitStrings.ss11
      - typingsSlinky.pdfkit.pdfkitStrings.ss12
      - typingsSlinky.pdfkit.pdfkitStrings.ss13
      - typingsSlinky.pdfkit.pdfkitStrings.ss14
      - typingsSlinky.pdfkit.pdfkitStrings.ss15
      - typingsSlinky.pdfkit.pdfkitStrings.ss16
      - typingsSlinky.pdfkit.pdfkitStrings.ss17
      - typingsSlinky.pdfkit.pdfkitStrings.ss18
      - typingsSlinky.pdfkit.pdfkitStrings.ss19
      - typingsSlinky.pdfkit.pdfkitStrings.ss20
      - typingsSlinky.pdfkit.pdfkitStrings.ssty
      - typingsSlinky.pdfkit.pdfkitStrings.stch
      - typingsSlinky.pdfkit.pdfkitStrings.subs
      - typingsSlinky.pdfkit.pdfkitStrings.sups
      - typingsSlinky.pdfkit.pdfkitStrings.swsh
      - typingsSlinky.pdfkit.pdfkitStrings.titl
      - typingsSlinky.pdfkit.pdfkitStrings.tjmo
      - typingsSlinky.pdfkit.pdfkitStrings.tnam
      - typingsSlinky.pdfkit.pdfkitStrings.tnum
      - typingsSlinky.pdfkit.pdfkitStrings.trad
      - typingsSlinky.pdfkit.pdfkitStrings.twid
      - typingsSlinky.pdfkit.pdfkitStrings.unic
      - typingsSlinky.pdfkit.pdfkitStrings.valt
      - typingsSlinky.pdfkit.pdfkitStrings.vatu
      - typingsSlinky.pdfkit.pdfkitStrings.vert
      - typingsSlinky.pdfkit.pdfkitStrings.vhal
      - typingsSlinky.pdfkit.pdfkitStrings.vjmo
      - typingsSlinky.pdfkit.pdfkitStrings.vkna
      - typingsSlinky.pdfkit.pdfkitStrings.vkrn
      - typingsSlinky.pdfkit.pdfkitStrings.vpal
      - typingsSlinky.pdfkit.pdfkitStrings.vrt2
      - typingsSlinky.pdfkit.pdfkitStrings.vrtr
      - typingsSlinky.pdfkit.pdfkitStrings.zero
    */
    trait OpenTypeFeatures extends StObject
    object OpenTypeFeatures {
      
      @scala.inline
      def aalt: typingsSlinky.pdfkit.pdfkitStrings.aalt = "aalt".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.aalt]
      
      @scala.inline
      def abvf: typingsSlinky.pdfkit.pdfkitStrings.abvf = "abvf".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.abvf]
      
      @scala.inline
      def abvm: typingsSlinky.pdfkit.pdfkitStrings.abvm = "abvm".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.abvm]
      
      @scala.inline
      def abvs: typingsSlinky.pdfkit.pdfkitStrings.abvs = "abvs".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.abvs]
      
      @scala.inline
      def afrc: typingsSlinky.pdfkit.pdfkitStrings.afrc = "afrc".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.afrc]
      
      @scala.inline
      def akhn: typingsSlinky.pdfkit.pdfkitStrings.akhn = "akhn".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.akhn]
      
      @scala.inline
      def blwf: typingsSlinky.pdfkit.pdfkitStrings.blwf = "blwf".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.blwf]
      
      @scala.inline
      def blwm: typingsSlinky.pdfkit.pdfkitStrings.blwm = "blwm".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.blwm]
      
      @scala.inline
      def blws: typingsSlinky.pdfkit.pdfkitStrings.blws = "blws".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.blws]
      
      @scala.inline
      def c2pc: typingsSlinky.pdfkit.pdfkitStrings.c2pc = "c2pc".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.c2pc]
      
      @scala.inline
      def c2sc: typingsSlinky.pdfkit.pdfkitStrings.c2sc = "c2sc".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.c2sc]
      
      @scala.inline
      def calt: typingsSlinky.pdfkit.pdfkitStrings.calt = "calt".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.calt]
      
      @scala.inline
      def `case`: typingsSlinky.pdfkit.pdfkitStrings.`case` = "case".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.`case`]
      
      @scala.inline
      def ccmp: typingsSlinky.pdfkit.pdfkitStrings.ccmp = "ccmp".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.ccmp]
      
      @scala.inline
      def cfar: typingsSlinky.pdfkit.pdfkitStrings.cfar = "cfar".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cfar]
      
      @scala.inline
      def cjct: typingsSlinky.pdfkit.pdfkitStrings.cjct = "cjct".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cjct]
      
      @scala.inline
      def clig: typingsSlinky.pdfkit.pdfkitStrings.clig = "clig".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.clig]
      
      @scala.inline
      def cpct: typingsSlinky.pdfkit.pdfkitStrings.cpct = "cpct".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cpct]
      
      @scala.inline
      def cpsp: typingsSlinky.pdfkit.pdfkitStrings.cpsp = "cpsp".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cpsp]
      
      @scala.inline
      def cswh: typingsSlinky.pdfkit.pdfkitStrings.cswh = "cswh".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cswh]
      
      @scala.inline
      def curs: typingsSlinky.pdfkit.pdfkitStrings.curs = "curs".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.curs]
      
      @scala.inline
      def cv01: typingsSlinky.pdfkit.pdfkitStrings.cv01 = "cv01".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv01]
      
      @scala.inline
      def cv02: typingsSlinky.pdfkit.pdfkitStrings.cv02 = "cv02".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv02]
      
      @scala.inline
      def cv03: typingsSlinky.pdfkit.pdfkitStrings.cv03 = "cv03".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv03]
      
      @scala.inline
      def cv04: typingsSlinky.pdfkit.pdfkitStrings.cv04 = "cv04".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv04]
      
      @scala.inline
      def cv05: typingsSlinky.pdfkit.pdfkitStrings.cv05 = "cv05".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv05]
      
      @scala.inline
      def cv06: typingsSlinky.pdfkit.pdfkitStrings.cv06 = "cv06".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv06]
      
      @scala.inline
      def cv07: typingsSlinky.pdfkit.pdfkitStrings.cv07 = "cv07".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv07]
      
      @scala.inline
      def cv08: typingsSlinky.pdfkit.pdfkitStrings.cv08 = "cv08".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv08]
      
      @scala.inline
      def cv09: typingsSlinky.pdfkit.pdfkitStrings.cv09 = "cv09".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv09]
      
      @scala.inline
      def cv10: typingsSlinky.pdfkit.pdfkitStrings.cv10 = "cv10".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv10]
      
      @scala.inline
      def cv11: typingsSlinky.pdfkit.pdfkitStrings.cv11 = "cv11".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv11]
      
      @scala.inline
      def cv12: typingsSlinky.pdfkit.pdfkitStrings.cv12 = "cv12".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv12]
      
      @scala.inline
      def cv13: typingsSlinky.pdfkit.pdfkitStrings.cv13 = "cv13".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv13]
      
      @scala.inline
      def cv14: typingsSlinky.pdfkit.pdfkitStrings.cv14 = "cv14".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv14]
      
      @scala.inline
      def cv15: typingsSlinky.pdfkit.pdfkitStrings.cv15 = "cv15".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv15]
      
      @scala.inline
      def cv16: typingsSlinky.pdfkit.pdfkitStrings.cv16 = "cv16".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv16]
      
      @scala.inline
      def cv17: typingsSlinky.pdfkit.pdfkitStrings.cv17 = "cv17".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv17]
      
      @scala.inline
      def cv18: typingsSlinky.pdfkit.pdfkitStrings.cv18 = "cv18".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv18]
      
      @scala.inline
      def cv19: typingsSlinky.pdfkit.pdfkitStrings.cv19 = "cv19".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv19]
      
      @scala.inline
      def cv20: typingsSlinky.pdfkit.pdfkitStrings.cv20 = "cv20".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv20]
      
      @scala.inline
      def cv21: typingsSlinky.pdfkit.pdfkitStrings.cv21 = "cv21".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv21]
      
      @scala.inline
      def cv22: typingsSlinky.pdfkit.pdfkitStrings.cv22 = "cv22".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv22]
      
      @scala.inline
      def cv23: typingsSlinky.pdfkit.pdfkitStrings.cv23 = "cv23".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv23]
      
      @scala.inline
      def cv24: typingsSlinky.pdfkit.pdfkitStrings.cv24 = "cv24".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv24]
      
      @scala.inline
      def cv25: typingsSlinky.pdfkit.pdfkitStrings.cv25 = "cv25".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv25]
      
      @scala.inline
      def cv26: typingsSlinky.pdfkit.pdfkitStrings.cv26 = "cv26".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv26]
      
      @scala.inline
      def cv27: typingsSlinky.pdfkit.pdfkitStrings.cv27 = "cv27".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv27]
      
      @scala.inline
      def cv28: typingsSlinky.pdfkit.pdfkitStrings.cv28 = "cv28".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv28]
      
      @scala.inline
      def cv29: typingsSlinky.pdfkit.pdfkitStrings.cv29 = "cv29".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv29]
      
      @scala.inline
      def cv30: typingsSlinky.pdfkit.pdfkitStrings.cv30 = "cv30".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv30]
      
      @scala.inline
      def cv31: typingsSlinky.pdfkit.pdfkitStrings.cv31 = "cv31".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv31]
      
      @scala.inline
      def cv32: typingsSlinky.pdfkit.pdfkitStrings.cv32 = "cv32".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv32]
      
      @scala.inline
      def cv33: typingsSlinky.pdfkit.pdfkitStrings.cv33 = "cv33".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv33]
      
      @scala.inline
      def cv34: typingsSlinky.pdfkit.pdfkitStrings.cv34 = "cv34".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv34]
      
      @scala.inline
      def cv35: typingsSlinky.pdfkit.pdfkitStrings.cv35 = "cv35".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv35]
      
      @scala.inline
      def cv36: typingsSlinky.pdfkit.pdfkitStrings.cv36 = "cv36".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv36]
      
      @scala.inline
      def cv37: typingsSlinky.pdfkit.pdfkitStrings.cv37 = "cv37".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv37]
      
      @scala.inline
      def cv38: typingsSlinky.pdfkit.pdfkitStrings.cv38 = "cv38".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv38]
      
      @scala.inline
      def cv39: typingsSlinky.pdfkit.pdfkitStrings.cv39 = "cv39".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv39]
      
      @scala.inline
      def cv40: typingsSlinky.pdfkit.pdfkitStrings.cv40 = "cv40".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv40]
      
      @scala.inline
      def cv41: typingsSlinky.pdfkit.pdfkitStrings.cv41 = "cv41".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv41]
      
      @scala.inline
      def cv42: typingsSlinky.pdfkit.pdfkitStrings.cv42 = "cv42".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv42]
      
      @scala.inline
      def cv43: typingsSlinky.pdfkit.pdfkitStrings.cv43 = "cv43".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv43]
      
      @scala.inline
      def cv44: typingsSlinky.pdfkit.pdfkitStrings.cv44 = "cv44".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv44]
      
      @scala.inline
      def cv45: typingsSlinky.pdfkit.pdfkitStrings.cv45 = "cv45".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv45]
      
      @scala.inline
      def cv46: typingsSlinky.pdfkit.pdfkitStrings.cv46 = "cv46".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv46]
      
      @scala.inline
      def cv47: typingsSlinky.pdfkit.pdfkitStrings.cv47 = "cv47".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv47]
      
      @scala.inline
      def cv48: typingsSlinky.pdfkit.pdfkitStrings.cv48 = "cv48".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv48]
      
      @scala.inline
      def cv49: typingsSlinky.pdfkit.pdfkitStrings.cv49 = "cv49".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv49]
      
      @scala.inline
      def cv50: typingsSlinky.pdfkit.pdfkitStrings.cv50 = "cv50".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv50]
      
      @scala.inline
      def cv51: typingsSlinky.pdfkit.pdfkitStrings.cv51 = "cv51".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv51]
      
      @scala.inline
      def cv52: typingsSlinky.pdfkit.pdfkitStrings.cv52 = "cv52".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv52]
      
      @scala.inline
      def cv53: typingsSlinky.pdfkit.pdfkitStrings.cv53 = "cv53".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv53]
      
      @scala.inline
      def cv54: typingsSlinky.pdfkit.pdfkitStrings.cv54 = "cv54".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv54]
      
      @scala.inline
      def cv55: typingsSlinky.pdfkit.pdfkitStrings.cv55 = "cv55".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv55]
      
      @scala.inline
      def cv56: typingsSlinky.pdfkit.pdfkitStrings.cv56 = "cv56".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv56]
      
      @scala.inline
      def cv57: typingsSlinky.pdfkit.pdfkitStrings.cv57 = "cv57".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv57]
      
      @scala.inline
      def cv58: typingsSlinky.pdfkit.pdfkitStrings.cv58 = "cv58".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv58]
      
      @scala.inline
      def cv59: typingsSlinky.pdfkit.pdfkitStrings.cv59 = "cv59".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv59]
      
      @scala.inline
      def cv60: typingsSlinky.pdfkit.pdfkitStrings.cv60 = "cv60".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv60]
      
      @scala.inline
      def cv61: typingsSlinky.pdfkit.pdfkitStrings.cv61 = "cv61".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv61]
      
      @scala.inline
      def cv62: typingsSlinky.pdfkit.pdfkitStrings.cv62 = "cv62".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv62]
      
      @scala.inline
      def cv63: typingsSlinky.pdfkit.pdfkitStrings.cv63 = "cv63".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv63]
      
      @scala.inline
      def cv64: typingsSlinky.pdfkit.pdfkitStrings.cv64 = "cv64".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv64]
      
      @scala.inline
      def cv65: typingsSlinky.pdfkit.pdfkitStrings.cv65 = "cv65".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv65]
      
      @scala.inline
      def cv66: typingsSlinky.pdfkit.pdfkitStrings.cv66 = "cv66".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv66]
      
      @scala.inline
      def cv67: typingsSlinky.pdfkit.pdfkitStrings.cv67 = "cv67".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv67]
      
      @scala.inline
      def cv68: typingsSlinky.pdfkit.pdfkitStrings.cv68 = "cv68".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv68]
      
      @scala.inline
      def cv69: typingsSlinky.pdfkit.pdfkitStrings.cv69 = "cv69".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv69]
      
      @scala.inline
      def cv70: typingsSlinky.pdfkit.pdfkitStrings.cv70 = "cv70".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv70]
      
      @scala.inline
      def cv71: typingsSlinky.pdfkit.pdfkitStrings.cv71 = "cv71".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv71]
      
      @scala.inline
      def cv72: typingsSlinky.pdfkit.pdfkitStrings.cv72 = "cv72".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv72]
      
      @scala.inline
      def cv73: typingsSlinky.pdfkit.pdfkitStrings.cv73 = "cv73".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv73]
      
      @scala.inline
      def cv74: typingsSlinky.pdfkit.pdfkitStrings.cv74 = "cv74".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv74]
      
      @scala.inline
      def cv75: typingsSlinky.pdfkit.pdfkitStrings.cv75 = "cv75".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv75]
      
      @scala.inline
      def cv76: typingsSlinky.pdfkit.pdfkitStrings.cv76 = "cv76".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv76]
      
      @scala.inline
      def cv77: typingsSlinky.pdfkit.pdfkitStrings.cv77 = "cv77".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv77]
      
      @scala.inline
      def cv78: typingsSlinky.pdfkit.pdfkitStrings.cv78 = "cv78".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv78]
      
      @scala.inline
      def cv79: typingsSlinky.pdfkit.pdfkitStrings.cv79 = "cv79".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv79]
      
      @scala.inline
      def cv80: typingsSlinky.pdfkit.pdfkitStrings.cv80 = "cv80".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv80]
      
      @scala.inline
      def cv81: typingsSlinky.pdfkit.pdfkitStrings.cv81 = "cv81".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv81]
      
      @scala.inline
      def cv82: typingsSlinky.pdfkit.pdfkitStrings.cv82 = "cv82".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv82]
      
      @scala.inline
      def cv83: typingsSlinky.pdfkit.pdfkitStrings.cv83 = "cv83".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv83]
      
      @scala.inline
      def cv84: typingsSlinky.pdfkit.pdfkitStrings.cv84 = "cv84".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv84]
      
      @scala.inline
      def cv85: typingsSlinky.pdfkit.pdfkitStrings.cv85 = "cv85".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv85]
      
      @scala.inline
      def cv86: typingsSlinky.pdfkit.pdfkitStrings.cv86 = "cv86".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv86]
      
      @scala.inline
      def cv87: typingsSlinky.pdfkit.pdfkitStrings.cv87 = "cv87".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv87]
      
      @scala.inline
      def cv88: typingsSlinky.pdfkit.pdfkitStrings.cv88 = "cv88".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv88]
      
      @scala.inline
      def cv89: typingsSlinky.pdfkit.pdfkitStrings.cv89 = "cv89".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv89]
      
      @scala.inline
      def cv90: typingsSlinky.pdfkit.pdfkitStrings.cv90 = "cv90".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv90]
      
      @scala.inline
      def cv91: typingsSlinky.pdfkit.pdfkitStrings.cv91 = "cv91".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv91]
      
      @scala.inline
      def cv92: typingsSlinky.pdfkit.pdfkitStrings.cv92 = "cv92".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv92]
      
      @scala.inline
      def cv93: typingsSlinky.pdfkit.pdfkitStrings.cv93 = "cv93".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv93]
      
      @scala.inline
      def cv94: typingsSlinky.pdfkit.pdfkitStrings.cv94 = "cv94".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv94]
      
      @scala.inline
      def cv95: typingsSlinky.pdfkit.pdfkitStrings.cv95 = "cv95".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv95]
      
      @scala.inline
      def cv96: typingsSlinky.pdfkit.pdfkitStrings.cv96 = "cv96".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv96]
      
      @scala.inline
      def cv97: typingsSlinky.pdfkit.pdfkitStrings.cv97 = "cv97".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv97]
      
      @scala.inline
      def cv98: typingsSlinky.pdfkit.pdfkitStrings.cv98 = "cv98".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv98]
      
      @scala.inline
      def cv99: typingsSlinky.pdfkit.pdfkitStrings.cv99 = "cv99".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.cv99]
      
      @scala.inline
      def dist: typingsSlinky.pdfkit.pdfkitStrings.dist = "dist".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.dist]
      
      @scala.inline
      def dlig: typingsSlinky.pdfkit.pdfkitStrings.dlig = "dlig".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.dlig]
      
      @scala.inline
      def dnom: typingsSlinky.pdfkit.pdfkitStrings.dnom = "dnom".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.dnom]
      
      @scala.inline
      def dtls: typingsSlinky.pdfkit.pdfkitStrings.dtls = "dtls".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.dtls]
      
      @scala.inline
      def expt: typingsSlinky.pdfkit.pdfkitStrings.expt = "expt".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.expt]
      
      @scala.inline
      def falt: typingsSlinky.pdfkit.pdfkitStrings.falt = "falt".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.falt]
      
      @scala.inline
      def fin2: typingsSlinky.pdfkit.pdfkitStrings.fin2 = "fin2".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.fin2]
      
      @scala.inline
      def fin3: typingsSlinky.pdfkit.pdfkitStrings.fin3 = "fin3".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.fin3]
      
      @scala.inline
      def fina: typingsSlinky.pdfkit.pdfkitStrings.fina = "fina".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.fina]
      
      @scala.inline
      def flac: typingsSlinky.pdfkit.pdfkitStrings.flac = "flac".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.flac]
      
      @scala.inline
      def frac: typingsSlinky.pdfkit.pdfkitStrings.frac = "frac".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.frac]
      
      @scala.inline
      def fwid: typingsSlinky.pdfkit.pdfkitStrings.fwid = "fwid".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.fwid]
      
      @scala.inline
      def half: typingsSlinky.pdfkit.pdfkitStrings.half = "half".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.half]
      
      @scala.inline
      def haln: typingsSlinky.pdfkit.pdfkitStrings.haln = "haln".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.haln]
      
      @scala.inline
      def halt: typingsSlinky.pdfkit.pdfkitStrings.halt = "halt".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.halt]
      
      @scala.inline
      def hist: typingsSlinky.pdfkit.pdfkitStrings.hist = "hist".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.hist]
      
      @scala.inline
      def hkna: typingsSlinky.pdfkit.pdfkitStrings.hkna = "hkna".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.hkna]
      
      @scala.inline
      def hlig: typingsSlinky.pdfkit.pdfkitStrings.hlig = "hlig".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.hlig]
      
      @scala.inline
      def hngl: typingsSlinky.pdfkit.pdfkitStrings.hngl = "hngl".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.hngl]
      
      @scala.inline
      def hojo: typingsSlinky.pdfkit.pdfkitStrings.hojo = "hojo".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.hojo]
      
      @scala.inline
      def hwid: typingsSlinky.pdfkit.pdfkitStrings.hwid = "hwid".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.hwid]
      
      @scala.inline
      def init: typingsSlinky.pdfkit.pdfkitStrings.init = "init".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.init]
      
      @scala.inline
      def isol: typingsSlinky.pdfkit.pdfkitStrings.isol = "isol".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.isol]
      
      @scala.inline
      def ital: typingsSlinky.pdfkit.pdfkitStrings.ital = "ital".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.ital]
      
      @scala.inline
      def jalt: typingsSlinky.pdfkit.pdfkitStrings.jalt = "jalt".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.jalt]
      
      @scala.inline
      def jp04: typingsSlinky.pdfkit.pdfkitStrings.jp04 = "jp04".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.jp04]
      
      @scala.inline
      def jp78: typingsSlinky.pdfkit.pdfkitStrings.jp78 = "jp78".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.jp78]
      
      @scala.inline
      def jp83: typingsSlinky.pdfkit.pdfkitStrings.jp83 = "jp83".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.jp83]
      
      @scala.inline
      def jp90: typingsSlinky.pdfkit.pdfkitStrings.jp90 = "jp90".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.jp90]
      
      @scala.inline
      def kern: typingsSlinky.pdfkit.pdfkitStrings.kern = "kern".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.kern]
      
      @scala.inline
      def lfbd: typingsSlinky.pdfkit.pdfkitStrings.lfbd = "lfbd".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.lfbd]
      
      @scala.inline
      def liga: typingsSlinky.pdfkit.pdfkitStrings.liga = "liga".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.liga]
      
      @scala.inline
      def ljmo: typingsSlinky.pdfkit.pdfkitStrings.ljmo = "ljmo".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.ljmo]
      
      @scala.inline
      def lnum: typingsSlinky.pdfkit.pdfkitStrings.lnum = "lnum".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.lnum]
      
      @scala.inline
      def locl: typingsSlinky.pdfkit.pdfkitStrings.locl = "locl".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.locl]
      
      @scala.inline
      def ltra: typingsSlinky.pdfkit.pdfkitStrings.ltra = "ltra".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.ltra]
      
      @scala.inline
      def ltrm: typingsSlinky.pdfkit.pdfkitStrings.ltrm = "ltrm".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.ltrm]
      
      @scala.inline
      def mark: typingsSlinky.pdfkit.pdfkitStrings.mark = "mark".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.mark]
      
      @scala.inline
      def med2: typingsSlinky.pdfkit.pdfkitStrings.med2 = "med2".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.med2]
      
      @scala.inline
      def medi: typingsSlinky.pdfkit.pdfkitStrings.medi = "medi".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.medi]
      
      @scala.inline
      def mgrk: typingsSlinky.pdfkit.pdfkitStrings.mgrk = "mgrk".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.mgrk]
      
      @scala.inline
      def mkmk: typingsSlinky.pdfkit.pdfkitStrings.mkmk = "mkmk".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.mkmk]
      
      @scala.inline
      def mset: typingsSlinky.pdfkit.pdfkitStrings.mset = "mset".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.mset]
      
      @scala.inline
      def nalt: typingsSlinky.pdfkit.pdfkitStrings.nalt = "nalt".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.nalt]
      
      @scala.inline
      def nlck: typingsSlinky.pdfkit.pdfkitStrings.nlck = "nlck".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.nlck]
      
      @scala.inline
      def nukt: typingsSlinky.pdfkit.pdfkitStrings.nukt = "nukt".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.nukt]
      
      @scala.inline
      def numr: typingsSlinky.pdfkit.pdfkitStrings.numr = "numr".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.numr]
      
      @scala.inline
      def onum: typingsSlinky.pdfkit.pdfkitStrings.onum = "onum".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.onum]
      
      @scala.inline
      def opbd: typingsSlinky.pdfkit.pdfkitStrings.opbd = "opbd".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.opbd]
      
      @scala.inline
      def ordn: typingsSlinky.pdfkit.pdfkitStrings.ordn = "ordn".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.ordn]
      
      @scala.inline
      def ornm: typingsSlinky.pdfkit.pdfkitStrings.ornm = "ornm".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.ornm]
      
      @scala.inline
      def palt: typingsSlinky.pdfkit.pdfkitStrings.palt = "palt".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.palt]
      
      @scala.inline
      def pcap: typingsSlinky.pdfkit.pdfkitStrings.pcap = "pcap".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.pcap]
      
      @scala.inline
      def pkna: typingsSlinky.pdfkit.pdfkitStrings.pkna = "pkna".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.pkna]
      
      @scala.inline
      def pnum: typingsSlinky.pdfkit.pdfkitStrings.pnum = "pnum".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.pnum]
      
      @scala.inline
      def pref: typingsSlinky.pdfkit.pdfkitStrings.pref = "pref".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.pref]
      
      @scala.inline
      def pres: typingsSlinky.pdfkit.pdfkitStrings.pres = "pres".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.pres]
      
      @scala.inline
      def pstf: typingsSlinky.pdfkit.pdfkitStrings.pstf = "pstf".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.pstf]
      
      @scala.inline
      def psts: typingsSlinky.pdfkit.pdfkitStrings.psts = "psts".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.psts]
      
      @scala.inline
      def pwid: typingsSlinky.pdfkit.pdfkitStrings.pwid = "pwid".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.pwid]
      
      @scala.inline
      def qwid: typingsSlinky.pdfkit.pdfkitStrings.qwid = "qwid".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.qwid]
      
      @scala.inline
      def rand: typingsSlinky.pdfkit.pdfkitStrings.rand = "rand".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.rand]
      
      @scala.inline
      def rclt: typingsSlinky.pdfkit.pdfkitStrings.rclt = "rclt".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.rclt]
      
      @scala.inline
      def rkrf: typingsSlinky.pdfkit.pdfkitStrings.rkrf = "rkrf".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.rkrf]
      
      @scala.inline
      def rlig: typingsSlinky.pdfkit.pdfkitStrings.rlig = "rlig".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.rlig]
      
      @scala.inline
      def rphf: typingsSlinky.pdfkit.pdfkitStrings.rphf = "rphf".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.rphf]
      
      @scala.inline
      def rtbd: typingsSlinky.pdfkit.pdfkitStrings.rtbd = "rtbd".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.rtbd]
      
      @scala.inline
      def rtla: typingsSlinky.pdfkit.pdfkitStrings.rtla = "rtla".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.rtla]
      
      @scala.inline
      def rtlm: typingsSlinky.pdfkit.pdfkitStrings.rtlm = "rtlm".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.rtlm]
      
      @scala.inline
      def ruby: typingsSlinky.pdfkit.pdfkitStrings.ruby = "ruby".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.ruby]
      
      @scala.inline
      def rvrn: typingsSlinky.pdfkit.pdfkitStrings.rvrn = "rvrn".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.rvrn]
      
      @scala.inline
      def salt: typingsSlinky.pdfkit.pdfkitStrings.salt = "salt".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.salt]
      
      @scala.inline
      def sinf: typingsSlinky.pdfkit.pdfkitStrings.sinf = "sinf".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.sinf]
      
      @scala.inline
      def size: typingsSlinky.pdfkit.pdfkitStrings.size = "size".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.size]
      
      @scala.inline
      def smcp: typingsSlinky.pdfkit.pdfkitStrings.smcp = "smcp".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.smcp]
      
      @scala.inline
      def smpl: typingsSlinky.pdfkit.pdfkitStrings.smpl = "smpl".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.smpl]
      
      @scala.inline
      def ss01: typingsSlinky.pdfkit.pdfkitStrings.ss01 = "ss01".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.ss01]
      
      @scala.inline
      def ss02: typingsSlinky.pdfkit.pdfkitStrings.ss02 = "ss02".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.ss02]
      
      @scala.inline
      def ss03: typingsSlinky.pdfkit.pdfkitStrings.ss03 = "ss03".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.ss03]
      
      @scala.inline
      def ss04: typingsSlinky.pdfkit.pdfkitStrings.ss04 = "ss04".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.ss04]
      
      @scala.inline
      def ss05: typingsSlinky.pdfkit.pdfkitStrings.ss05 = "ss05".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.ss05]
      
      @scala.inline
      def ss06: typingsSlinky.pdfkit.pdfkitStrings.ss06 = "ss06".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.ss06]
      
      @scala.inline
      def ss07: typingsSlinky.pdfkit.pdfkitStrings.ss07 = "ss07".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.ss07]
      
      @scala.inline
      def ss08: typingsSlinky.pdfkit.pdfkitStrings.ss08 = "ss08".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.ss08]
      
      @scala.inline
      def ss09: typingsSlinky.pdfkit.pdfkitStrings.ss09 = "ss09".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.ss09]
      
      @scala.inline
      def ss10: typingsSlinky.pdfkit.pdfkitStrings.ss10 = "ss10".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.ss10]
      
      @scala.inline
      def ss11: typingsSlinky.pdfkit.pdfkitStrings.ss11 = "ss11".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.ss11]
      
      @scala.inline
      def ss12: typingsSlinky.pdfkit.pdfkitStrings.ss12 = "ss12".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.ss12]
      
      @scala.inline
      def ss13: typingsSlinky.pdfkit.pdfkitStrings.ss13 = "ss13".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.ss13]
      
      @scala.inline
      def ss14: typingsSlinky.pdfkit.pdfkitStrings.ss14 = "ss14".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.ss14]
      
      @scala.inline
      def ss15: typingsSlinky.pdfkit.pdfkitStrings.ss15 = "ss15".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.ss15]
      
      @scala.inline
      def ss16: typingsSlinky.pdfkit.pdfkitStrings.ss16 = "ss16".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.ss16]
      
      @scala.inline
      def ss17: typingsSlinky.pdfkit.pdfkitStrings.ss17 = "ss17".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.ss17]
      
      @scala.inline
      def ss18: typingsSlinky.pdfkit.pdfkitStrings.ss18 = "ss18".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.ss18]
      
      @scala.inline
      def ss19: typingsSlinky.pdfkit.pdfkitStrings.ss19 = "ss19".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.ss19]
      
      @scala.inline
      def ss20: typingsSlinky.pdfkit.pdfkitStrings.ss20 = "ss20".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.ss20]
      
      @scala.inline
      def ssty: typingsSlinky.pdfkit.pdfkitStrings.ssty = "ssty".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.ssty]
      
      @scala.inline
      def stch: typingsSlinky.pdfkit.pdfkitStrings.stch = "stch".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.stch]
      
      @scala.inline
      def subs: typingsSlinky.pdfkit.pdfkitStrings.subs = "subs".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.subs]
      
      @scala.inline
      def sups: typingsSlinky.pdfkit.pdfkitStrings.sups = "sups".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.sups]
      
      @scala.inline
      def swsh: typingsSlinky.pdfkit.pdfkitStrings.swsh = "swsh".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.swsh]
      
      @scala.inline
      def titl: typingsSlinky.pdfkit.pdfkitStrings.titl = "titl".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.titl]
      
      @scala.inline
      def tjmo: typingsSlinky.pdfkit.pdfkitStrings.tjmo = "tjmo".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.tjmo]
      
      @scala.inline
      def tnam: typingsSlinky.pdfkit.pdfkitStrings.tnam = "tnam".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.tnam]
      
      @scala.inline
      def tnum: typingsSlinky.pdfkit.pdfkitStrings.tnum = "tnum".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.tnum]
      
      @scala.inline
      def trad: typingsSlinky.pdfkit.pdfkitStrings.trad = "trad".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.trad]
      
      @scala.inline
      def twid: typingsSlinky.pdfkit.pdfkitStrings.twid = "twid".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.twid]
      
      @scala.inline
      def unic: typingsSlinky.pdfkit.pdfkitStrings.unic = "unic".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.unic]
      
      @scala.inline
      def valt: typingsSlinky.pdfkit.pdfkitStrings.valt = "valt".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.valt]
      
      @scala.inline
      def vatu: typingsSlinky.pdfkit.pdfkitStrings.vatu = "vatu".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.vatu]
      
      @scala.inline
      def vert: typingsSlinky.pdfkit.pdfkitStrings.vert = "vert".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.vert]
      
      @scala.inline
      def vhal: typingsSlinky.pdfkit.pdfkitStrings.vhal = "vhal".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.vhal]
      
      @scala.inline
      def vjmo: typingsSlinky.pdfkit.pdfkitStrings.vjmo = "vjmo".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.vjmo]
      
      @scala.inline
      def vkna: typingsSlinky.pdfkit.pdfkitStrings.vkna = "vkna".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.vkna]
      
      @scala.inline
      def vkrn: typingsSlinky.pdfkit.pdfkitStrings.vkrn = "vkrn".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.vkrn]
      
      @scala.inline
      def vpal: typingsSlinky.pdfkit.pdfkitStrings.vpal = "vpal".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.vpal]
      
      @scala.inline
      def vrt2: typingsSlinky.pdfkit.pdfkitStrings.vrt2 = "vrt2".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.vrt2]
      
      @scala.inline
      def vrtr: typingsSlinky.pdfkit.pdfkitStrings.vrtr = "vrtr".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.vrtr]
      
      @scala.inline
      def zero: typingsSlinky.pdfkit.pdfkitStrings.zero = "zero".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.zero]
    }
    
    @js.native
    trait PDFAnnotation extends StObject {
      
      def annotate(x: Double, y: Double, w: Double, h: Double, option: AnnotationOption): this.type = js.native
      
      def ellipseAnnotation(x: Double, y: Double, w: Double, h: Double): this.type = js.native
      def ellipseAnnotation(x: Double, y: Double, w: Double, h: Double, option: AnnotationOption): this.type = js.native
      
      def goTo(x: Double, y: Double, w: Double, h: Double, name: String): this.type = js.native
      def goTo(x: Double, y: Double, w: Double, h: Double, name: String, options: AnnotationOption): this.type = js.native
      
      def highlight(x: Double, y: Double, w: Double, h: Double): this.type = js.native
      def highlight(x: Double, y: Double, w: Double, h: Double, option: AnnotationOption): this.type = js.native
      
      def lineAnnotation(x1: Double, y1: Double, x2: Double, y2: Double): this.type = js.native
      def lineAnnotation(x1: Double, y1: Double, x2: Double, y2: Double, option: AnnotationOption): this.type = js.native
      
      def link(x: Double, y: Double, w: Double, h: Double, url: String): this.type = js.native
      def link(x: Double, y: Double, w: Double, h: Double, url: String, option: AnnotationOption): this.type = js.native
      
      def note(x: Double, y: Double, w: Double, h: Double, content: String): this.type = js.native
      def note(x: Double, y: Double, w: Double, h: Double, content: String, option: AnnotationOption): this.type = js.native
      
      def rectAnnotation(x: Double, y: Double, w: Double, h: Double): this.type = js.native
      def rectAnnotation(x: Double, y: Double, w: Double, h: Double, option: AnnotationOption): this.type = js.native
      
      def strike(x: Double, y: Double, w: Double, h: Double): this.type = js.native
      def strike(x: Double, y: Double, w: Double, h: Double, option: AnnotationOption): this.type = js.native
      
      def textAnnotation(x: Double, y: Double, w: Double, h: Double, text: String): this.type = js.native
      def textAnnotation(x: Double, y: Double, w: Double, h: Double, text: String, option: AnnotationOption): this.type = js.native
      
      def underline(x: Double, y: Double, w: Double, h: Double): this.type = js.native
      def underline(x: Double, y: Double, w: Double, h: Double, option: AnnotationOption): this.type = js.native
    }
    
    @js.native
    trait PDFColor extends StObject {
      
      def fillColor(color: ColorValue): this.type = js.native
      def fillColor(color: ColorValue, opacity: Double): this.type = js.native
      
      def fillOpacity(opacity: Double): this.type = js.native
      
      def linearGradient(x1: Double, y1: Double, x2: Double, y2: Double): PDFLinearGradient = js.native
      
      def opacity(opacity: Double): this.type = js.native
      
      def radialGradient(x1: Double, y1: Double, r1: Double, x2: Double, y2: Double, r2: Double): PDFRadialGradient = js.native
      
      def strokeColor(color: ColorValue): this.type = js.native
      def strokeColor(color: ColorValue, opacity: Double): this.type = js.native
      
      def strokeOpacity(opacity: Double): this.type = js.native
    }
    
    @js.native
    trait PDFFont extends StObject {
      
      def currentLineHeight(): Double = js.native
      def currentLineHeight(includeGap: Boolean): Double = js.native
      
      def font(buffer: Buffer): this.type = js.native
      def font(src: String): this.type = js.native
      def font(src: String, family: js.UndefOr[scala.Nothing], size: Double): this.type = js.native
      def font(src: String, family: String): this.type = js.native
      def font(src: String, family: String, size: Double): this.type = js.native
      
      def fontSize(size: Double): this.type = js.native
      
      def registerFont(name: String): this.type = js.native
      def registerFont(name: String, src: js.UndefOr[PDFFontSource], family: String): this.type = js.native
      def registerFont(name: String, src: PDFFontSource): this.type = js.native
    }
    
    type PDFFontSource = String | Buffer | js.typedarray.Uint8Array | js.typedarray.ArrayBuffer
    
    @js.native
    trait PDFImage extends StObject {
      
      /**
        * Draw an image in PDFKit document.
        */
      def image(src: js.Any): this.type = js.native
      def image(src: js.Any, options: ImageOption): this.type = js.native
      def image(src: js.Any, x: js.UndefOr[scala.Nothing], y: js.UndefOr[scala.Nothing], options: ImageOption): this.type = js.native
      def image(src: js.Any, x: js.UndefOr[scala.Nothing], y: Double): this.type = js.native
      def image(src: js.Any, x: js.UndefOr[scala.Nothing], y: Double, options: ImageOption): this.type = js.native
      def image(src: js.Any, x: Double): this.type = js.native
      def image(src: js.Any, x: Double, y: js.UndefOr[scala.Nothing], options: ImageOption): this.type = js.native
      def image(src: js.Any, x: Double, y: Double): this.type = js.native
      def image(src: js.Any, x: Double, y: Double, options: ImageOption): this.type = js.native
    }
    
    @js.native
    trait PDFText extends StObject {
      
      def heightOfString(text: String): Double = js.native
      def heightOfString(text: String, options: TextOptions): Double = js.native
      
      def lineGap(lineGap: Double): this.type = js.native
      
      def list(list: js.Array[String | _]): this.type = js.native
      def list(list: js.Array[String | _], options: TextOptions): this.type = js.native
      def list(
        list: js.Array[String | _],
        x: js.UndefOr[scala.Nothing],
        y: js.UndefOr[scala.Nothing],
        options: TextOptions
      ): this.type = js.native
      def list(list: js.Array[String | _], x: js.UndefOr[scala.Nothing], y: Double): this.type = js.native
      def list(list: js.Array[String | _], x: js.UndefOr[scala.Nothing], y: Double, options: TextOptions): this.type = js.native
      def list(list: js.Array[String | _], x: Double): this.type = js.native
      def list(list: js.Array[String | _], x: Double, y: js.UndefOr[scala.Nothing], options: TextOptions): this.type = js.native
      def list(list: js.Array[String | _], x: Double, y: Double): this.type = js.native
      def list(list: js.Array[String | _], x: Double, y: Double, options: TextOptions): this.type = js.native
      
      def moveDown(): this.type = js.native
      def moveDown(line: Double): this.type = js.native
      
      def moveUp(): this.type = js.native
      def moveUp(line: Double): this.type = js.native
      
      def text(text: String): this.type = js.native
      def text(text: String, options: TextOptions): this.type = js.native
      def text(text: String, x: js.UndefOr[scala.Nothing], y: js.UndefOr[scala.Nothing], options: TextOptions): this.type = js.native
      def text(text: String, x: js.UndefOr[scala.Nothing], y: Double): this.type = js.native
      def text(text: String, x: js.UndefOr[scala.Nothing], y: Double, options: TextOptions): this.type = js.native
      def text(text: String, x: Double): this.type = js.native
      def text(text: String, x: Double, y: js.UndefOr[scala.Nothing], options: TextOptions): this.type = js.native
      def text(text: String, x: Double, y: Double): this.type = js.native
      def text(text: String, x: Double, y: Double, options: TextOptions): this.type = js.native
      
      def widthOfString(text: String): Double = js.native
      def widthOfString(text: String, options: TextOptions): Double = js.native
    }
    
    @js.native
    trait PDFVector extends StObject {
      
      def bezierCurveTo(cp1x: Double, cp1y: Double, cp2x: Double, cp2y: Double, x: Double, y: Double): this.type = js.native
      
      def circle(x: Double, y: Double, raduis: Double): this.type = js.native
      
      def clip(): this.type = js.native
      def clip(rule: RuleValue): this.type = js.native
      
      def closePath(): this.type = js.native
      
      def dash(length: Double, option: js.Any): this.type = js.native
      
      def ellipse(x: Double, y: Double, r1: Double): this.type = js.native
      def ellipse(x: Double, y: Double, r1: Double, r2: Double): this.type = js.native
      
      def fill(): this.type = js.native
      def fill(color: js.UndefOr[ColorValue], rule: RuleValue): this.type = js.native
      def fill(color: ColorValue): this.type = js.native
      def fill(rule: RuleValue): this.type = js.native
      
      def fillAndStroke(): this.type = js.native
      def fillAndStroke(fillColor: js.UndefOr[ColorValue], strokeColor: js.UndefOr[ColorValue], rule: RuleValue): this.type = js.native
      def fillAndStroke(fillColor: js.UndefOr[ColorValue], strokeColor: ColorValue): this.type = js.native
      def fillAndStroke(fillColor: ColorValue): this.type = js.native
      def fillAndStroke(fillColor: ColorValue, rule: RuleValue): this.type = js.native
      def fillAndStroke(rule: RuleValue): this.type = js.native
      
      def lineCap(c: String): this.type = js.native
      
      def lineJoin(j: String): this.type = js.native
      
      def lineTo(x: Double, y: Double): this.type = js.native
      
      def lineWidth(w: Double): this.type = js.native
      
      def miterLimit(m: js.Any): this.type = js.native
      
      def moveTo(x: Double, y: Double): this.type = js.native
      
      def path(path: String): this.type = js.native
      
      def polygon(points: js.Array[Double]*): this.type = js.native
      
      def quadraticCurveTo(cpx: Double, cpy: Double, x: Double, y: Double): this.type = js.native
      
      def rect(x: Double, y: Double, w: Double, h: Double): this.type = js.native
      
      def restore(): this.type = js.native
      
      def rotate(angle: Double): this.type = js.native
      def rotate(angle: Double, options: Origin): this.type = js.native
      
      def roundedRect(x: Double, y: Double, w: Double, h: Double): this.type = js.native
      def roundedRect(x: Double, y: Double, w: Double, h: Double, r: Double): this.type = js.native
      
      def save(): this.type = js.native
      
      def scale(xFactor: Double): this.type = js.native
      def scale(xFactor: Double, yFactor: js.UndefOr[scala.Nothing], options: Origin): this.type = js.native
      def scale(xFactor: Double, yFactor: Double): this.type = js.native
      def scale(xFactor: Double, yFactor: Double, options: Origin): this.type = js.native
      
      def stroke(): this.type = js.native
      def stroke(color: ColorValue): this.type = js.native
      
      def transform(m11: Double, m12: Double, m21: Double, m22: Double, dx: Double, dy: Double): this.type = js.native
      
      def translate(x: Double, y: Double): this.type = js.native
      
      def undash(): this.type = js.native
    }
    
    // The winding / filling rule accepted by PDFKit:
    /* Rewritten from type alias, can be one of: 
      - typingsSlinky.pdfkit.pdfkitStrings.`even-odd`
      - typingsSlinky.pdfkit.pdfkitStrings.evenodd
      - typingsSlinky.pdfkit.pdfkitStrings.`non-zero`
      - typingsSlinky.pdfkit.pdfkitStrings.nonzero
    */
    trait RuleValue extends StObject
    object RuleValue {
      
      @scala.inline
      def `even-odd`: typingsSlinky.pdfkit.pdfkitStrings.`even-odd` = "even-odd".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.`even-odd`]
      
      @scala.inline
      def evenodd: typingsSlinky.pdfkit.pdfkitStrings.evenodd = "evenodd".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.evenodd]
      
      @scala.inline
      def `non-zero`: typingsSlinky.pdfkit.pdfkitStrings.`non-zero` = "non-zero".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.`non-zero`]
      
      @scala.inline
      def nonzero: typingsSlinky.pdfkit.pdfkitStrings.nonzero = "nonzero".asInstanceOf[typingsSlinky.pdfkit.pdfkitStrings.nonzero]
    }
    
    @js.native
    trait TextOptions extends StObject {
      
      /** the alignment of the text (center, justify, left, right) */
      //TODO check this
      var align: js.UndefOr[center | justify | left | right | String] = js.native
      
      /** the vertical alignment of the text with respect to its insertion point */
      var baseline: js.UndefOr[
            Double | `svg-middle` | middle | `svg-central` | bottom | ideographic | alphabetic | mathematical | hanging | top
          ] = js.native
      
      /** the amount of space between each character in the text */
      var characterSpacing: js.UndefOr[Double] = js.native
      
      /** the amount of space between each column (1/4 inch by default) */
      var columnGap: js.UndefOr[Double] = js.native
      
      /**  the number of columns to flow the text into */
      var columns: js.UndefOr[Double] = js.native
      
      /** whether the text segment will be followed immediately by another segment. Useful for changing styling in the middle of a paragraph. */
      var continued: js.UndefOr[Boolean] = js.native
      
      /** The character to display at the end of the text when it is too long. Set to true to use the default character. */
      var ellipsis: js.UndefOr[Boolean | String] = js.native
      
      /** an array of OpenType feature tags to apply. If not provided, a set of defaults is used. */
      var features: js.UndefOr[js.Array[OpenTypeFeatures]] = js.native
      
      /** whether to fill the text (true by default) */
      var fill: js.UndefOr[Boolean] = js.native
      
      /**  The maximum height that text should be clipped to */
      var height: js.UndefOr[Double] = js.native
      
      /** The amount in PDF points (72 per inch) to indent each paragraph of text */
      var indent: js.UndefOr[Double] = js.native
      
      /**  Set to false to disable line wrapping all together */
      var lineBreak: js.UndefOr[Boolean] = js.native
      
      /** the amount of space between each line of text */
      var lineGap: js.UndefOr[Double] = js.native
      
      /** A URL to link this text to (shortcut to create an annotation) */
      var link: js.UndefOr[String] = js.native
      
      /** whether to slant the text (angle in degrees or true) */
      var oblique: js.UndefOr[Boolean | Double] = js.native
      
      /** the amount of space between each paragraph of text */
      var paragraphGap: js.UndefOr[Double] = js.native
      
      /** whether to strike out the text */
      var strike: js.UndefOr[Boolean] = js.native
      
      /**  whether to stroke the text */
      var stroke: js.UndefOr[Boolean] = js.native
      
      /** whether to underline the text */
      var underline: js.UndefOr[Boolean] = js.native
      
      /** The width that text should be wrapped to (by default, the page width minus the left and right margin) */
      var width: js.UndefOr[Double] = js.native
      
      /** the amount of space between each word in the text */
      var wordSpacing: js.UndefOr[Double] = js.native
    }
    object TextOptions {
      
      @scala.inline
      def apply(): TextOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[TextOptions]
      }
      
      @scala.inline
      implicit class TextOptionsMutableBuilder[Self <: TextOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAlign(value: center | justify | left | right | String): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
        
        @scala.inline
        def setBaseline(
          value: Double | `svg-middle` | middle | `svg-central` | bottom | ideographic | alphabetic | mathematical | hanging | top
        ): Self = StObject.set(x, "baseline", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBaselineUndefined: Self = StObject.set(x, "baseline", js.undefined)
        
        @scala.inline
        def setCharacterSpacing(value: Double): Self = StObject.set(x, "characterSpacing", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCharacterSpacingUndefined: Self = StObject.set(x, "characterSpacing", js.undefined)
        
        @scala.inline
        def setColumnGap(value: Double): Self = StObject.set(x, "columnGap", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setColumnGapUndefined: Self = StObject.set(x, "columnGap", js.undefined)
        
        @scala.inline
        def setColumns(value: Double): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
        
        @scala.inline
        def setContinued(value: Boolean): Self = StObject.set(x, "continued", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setContinuedUndefined: Self = StObject.set(x, "continued", js.undefined)
        
        @scala.inline
        def setEllipsis(value: Boolean | String): Self = StObject.set(x, "ellipsis", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEllipsisUndefined: Self = StObject.set(x, "ellipsis", js.undefined)
        
        @scala.inline
        def setFeatures(value: js.Array[OpenTypeFeatures]): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFeaturesUndefined: Self = StObject.set(x, "features", js.undefined)
        
        @scala.inline
        def setFeaturesVarargs(value: OpenTypeFeatures*): Self = StObject.set(x, "features", js.Array(value :_*))
        
        @scala.inline
        def setFill(value: Boolean): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
        
        @scala.inline
        def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
        
        @scala.inline
        def setIndent(value: Double): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIndentUndefined: Self = StObject.set(x, "indent", js.undefined)
        
        @scala.inline
        def setLineBreak(value: Boolean): Self = StObject.set(x, "lineBreak", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLineBreakUndefined: Self = StObject.set(x, "lineBreak", js.undefined)
        
        @scala.inline
        def setLineGap(value: Double): Self = StObject.set(x, "lineGap", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLineGapUndefined: Self = StObject.set(x, "lineGap", js.undefined)
        
        @scala.inline
        def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
        
        @scala.inline
        def setOblique(value: Boolean | Double): Self = StObject.set(x, "oblique", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setObliqueUndefined: Self = StObject.set(x, "oblique", js.undefined)
        
        @scala.inline
        def setParagraphGap(value: Double): Self = StObject.set(x, "paragraphGap", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setParagraphGapUndefined: Self = StObject.set(x, "paragraphGap", js.undefined)
        
        @scala.inline
        def setStrike(value: Boolean): Self = StObject.set(x, "strike", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStrikeUndefined: Self = StObject.set(x, "strike", js.undefined)
        
        @scala.inline
        def setStroke(value: Boolean): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
        
        @scala.inline
        def setUnderline(value: Boolean): Self = StObject.set(x, "underline", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUnderlineUndefined: Self = StObject.set(x, "underline", js.undefined)
        
        @scala.inline
        def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
        
        @scala.inline
        def setWordSpacing(value: Double): Self = StObject.set(x, "wordSpacing", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWordSpacingUndefined: Self = StObject.set(x, "wordSpacing", js.undefined)
      }
    }
  }
  
  /**
    * PDFKit data
    */
  @js.native
  trait PDFData
    extends Instantiable1[/* data */ js.Array[js.Any], PDFData] {
    
    def byteAt(index: Double): js.Any = js.native
    
    def read(length: Double): js.Array[_] = js.native
    
    def readBool(): Boolean = js.native
    
    def readByte(): js.Any = js.native
    
    def readInt(): Double = js.native
    
    def readInt16(): Double = js.native
    
    def readInt32(): Double = js.native
    
    def readLongLong(): Double = js.native
    
    def readShort(): Double = js.native
    
    def readString(length: Double): String = js.native
    
    def readUInt16(): Double = js.native
    
    def readUInt32(): Double = js.native
    
    def slice(start: Double, end: Double): js.Array[_] = js.native
    
    def stringAt(pos: Double, length: Double): String = js.native
    
    def write(bytes: js.Array[_]): Unit = js.native
    
    def writeBool(`val`: Boolean): Boolean = js.native
    
    def writeByte(byte: js.Any): Unit = js.native
    
    def writeInt(`val`: Double): Unit = js.native
    
    def writeInt16(`val`: Double): Unit = js.native
    
    def writeInt32(`val`: Double): Unit = js.native
    
    def writeLongLong(`val`: Double): Unit = js.native
    
    def writeShort(`val`: Double): Unit = js.native
    
    def writeString(`val`: String): Unit = js.native
    
    def writeUInt16(`val`: Double): Unit = js.native
    
    def writeUInt32(`val`: Double): Unit = js.native
  }
  
  @js.native
  trait PDFDocument
    extends ReadableStream
       with PDFAnnotation
       with PDFColor
       with PDFImage
       with PDFText
       with PDFVector
       with PDFFont
       with Instantiable0[PDFDocument]
       with Instantiable1[/* options */ PDFDocumentOptions, PDFDocument] {
    
    def addContent(data: js.Any): PDFDocument = js.native
    
    def addPage(): PDFDocument = js.native
    def addPage(options: PDFDocumentOptions): PDFDocument = js.native
    
    def bufferedPageRange(): Count = js.native
    
    /**
      * Wheter streams should be compressed
      */
    var compress: Boolean = js.native
    
    def end(): Unit = js.native
    
    def flushPages(): Unit = js.native
    
    /**
      * PDF document Metadata
      */
    var info: DocumentInfo = js.native
    
    /**
      * Options for the document
      */
    var options: PDFDocumentOptions = js.native
    
    /**
      * Deprecated. Throws exception
      */
    def output(fn: js.Any): Unit = js.native
    
    /**
      * Represent the current page.
      */
    var page: PDFPage = js.native
    
    def ref(data: js.Object): PDFKitReference = js.native
    
    def switchToPage(): PDFPage = js.native
    def switchToPage(n: Double): PDFPage = js.native
    
    /**
      * PDF Version
      */
    var version: Double = js.native
    
    /**
      * Deprecated
      */
    def write(fileName: String, fn: js.Any): Unit = js.native
    
    var x: Double = js.native
    
    var y: Double = js.native
  }
  
  @js.native
  trait PDFDocumentOptions extends StObject {
    
    var autoFirstPage: js.UndefOr[Boolean] = js.native
    
    var bufferPages: js.UndefOr[Boolean] = js.native
    
    var compress: js.UndefOr[Boolean] = js.native
    
    var info: js.UndefOr[DocumentInfo] = js.native
    
    var layout: js.UndefOr[portrait | landscape] = js.native
    
    var margin: js.UndefOr[Double] = js.native
    
    var margins: js.UndefOr[Bottom] = js.native
    
    var ownerPassword: js.UndefOr[String] = js.native
    
    var pdfVersion: js.UndefOr[`1Dot3` | `1Dot4` | `1Dot5` | `1Dot6` | `1Dot7` | `1Dot7ext3`] = js.native
    
    var permissions: js.UndefOr[DocumentPermissions] = js.native
    
    var size: js.UndefOr[js.Array[Double] | String] = js.native
    
    var userPassword: js.UndefOr[String] = js.native
  }
  object PDFDocumentOptions {
    
    @scala.inline
    def apply(): PDFDocumentOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PDFDocumentOptions]
    }
    
    @scala.inline
    implicit class PDFDocumentOptionsMutableBuilder[Self <: PDFDocumentOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoFirstPage(value: Boolean): Self = StObject.set(x, "autoFirstPage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoFirstPageUndefined: Self = StObject.set(x, "autoFirstPage", js.undefined)
      
      @scala.inline
      def setBufferPages(value: Boolean): Self = StObject.set(x, "bufferPages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBufferPagesUndefined: Self = StObject.set(x, "bufferPages", js.undefined)
      
      @scala.inline
      def setCompress(value: Boolean): Self = StObject.set(x, "compress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompressUndefined: Self = StObject.set(x, "compress", js.undefined)
      
      @scala.inline
      def setInfo(value: DocumentInfo): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
      
      @scala.inline
      def setLayout(value: portrait | landscape): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
      
      @scala.inline
      def setMargin(value: Double): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      @scala.inline
      def setMargins(value: Bottom): Self = StObject.set(x, "margins", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginsUndefined: Self = StObject.set(x, "margins", js.undefined)
      
      @scala.inline
      def setOwnerPassword(value: String): Self = StObject.set(x, "ownerPassword", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOwnerPasswordUndefined: Self = StObject.set(x, "ownerPassword", js.undefined)
      
      @scala.inline
      def setPdfVersion(value: `1Dot3` | `1Dot4` | `1Dot5` | `1Dot6` | `1Dot7` | `1Dot7ext3`): Self = StObject.set(x, "pdfVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPdfVersionUndefined: Self = StObject.set(x, "pdfVersion", js.undefined)
      
      @scala.inline
      def setPermissions(value: DocumentPermissions): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPermissionsUndefined: Self = StObject.set(x, "permissions", js.undefined)
      
      @scala.inline
      def setSize(value: js.Array[Double] | String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setSizeVarargs(value: Double*): Self = StObject.set(x, "size", js.Array(value :_*))
      
      @scala.inline
      def setUserPassword(value: String): Self = StObject.set(x, "userPassword", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserPasswordUndefined: Self = StObject.set(x, "userPassword", js.undefined)
    }
  }
  
  @js.native
  trait PDFGradient
    extends Instantiable1[/* document */ js.Any, PDFGradient] {
    
    @JSName("apply")
    def apply(): Unit = js.native
    
    def embed(): Unit = js.native
    
    def stop(pos: Double): PDFGradient = js.native
    def stop(pos: Double, color: js.UndefOr[scala.Nothing], opacity: Double): PDFGradient = js.native
    def stop(pos: Double, color: String): PDFGradient = js.native
    def stop(pos: Double, color: String, opacity: Double): PDFGradient = js.native
    def stop(pos: Double, color: PDFGradient): PDFGradient = js.native
    def stop(pos: Double, color: PDFGradient, opacity: Double): PDFGradient = js.native
  }
  
  /** PDFReference - represents a reference to another object in the PDF object heirarchy */
  @js.native
  trait PDFKitReference extends StObject {
    
    var chunks: js.Array[_] = js.native
    
    var compress: Boolean = js.native
    
    var data: Annots = js.native
    
    var deflate: js.Any = js.native
    
    var document: PDFDocument = js.native
    
    def end(chunk: js.Any): Unit = js.native
    
    var gen: Double = js.native
    
    var id: Double = js.native
    
    def initDeflate(): Unit = js.native
    
    var uncompressedLength: Double = js.native
    
    def write(chunk: js.Any): Unit = js.native
  }
  object PDFKitReference {
    
    @scala.inline
    def apply(
      chunks: js.Array[_],
      compress: Boolean,
      data: Annots,
      deflate: js.Any,
      document: PDFDocument,
      end: js.Any => Unit,
      gen: Double,
      id: Double,
      initDeflate: () => Unit,
      uncompressedLength: Double,
      write: js.Any => Unit
    ): PDFKitReference = {
      val __obj = js.Dynamic.literal(chunks = chunks.asInstanceOf[js.Any], compress = compress.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], deflate = deflate.asInstanceOf[js.Any], document = document.asInstanceOf[js.Any], end = js.Any.fromFunction1(end), gen = gen.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], initDeflate = js.Any.fromFunction0(initDeflate), uncompressedLength = uncompressedLength.asInstanceOf[js.Any], write = js.Any.fromFunction1(write))
      __obj.asInstanceOf[PDFKitReference]
    }
    
    @scala.inline
    implicit class PDFKitReferenceMutableBuilder[Self <: PDFKitReference] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChunks(value: js.Array[_]): Self = StObject.set(x, "chunks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChunksVarargs(value: js.Any*): Self = StObject.set(x, "chunks", js.Array(value :_*))
      
      @scala.inline
      def setCompress(value: Boolean): Self = StObject.set(x, "compress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setData(value: Annots): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeflate(value: js.Any): Self = StObject.set(x, "deflate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDocument(value: PDFDocument): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnd(value: js.Any => Unit): Self = StObject.set(x, "end", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGen(value: Double): Self = StObject.set(x, "gen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitDeflate(value: () => Unit): Self = StObject.set(x, "initDeflate", js.Any.fromFunction0(value))
      
      @scala.inline
      def setUncompressedLength(value: Double): Self = StObject.set(x, "uncompressedLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrite(value: js.Any => Unit): Self = StObject.set(x, "write", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait PDFLinearGradient
    extends PDFGradient
       with Instantiable5[
          /* document */ js.Any, 
          /* x1 */ Double, 
          /* y1 */ Double, 
          /* x2 */ Double, 
          /* y2 */ Double, 
          PDFLinearGradient
        ] {
    
    def opacityGradient(): PDFLinearGradient = js.native
    
    def shader(fn: js.Function0[_]): js.Any = js.native
  }
  
  /**
    * Represent a single page in the PDF document
    */
  @js.native
  trait PDFPage extends StObject {
    
    var annotations: js.Any = js.native
    
    var content: PDFKitReference = js.native
    
    /**
      * The page dictionnary
      */
    var dictionary: PDFKitReference = js.native
    
    var document: PDFDocument = js.native
    
    def end(): Unit = js.native
    
    var ext_gstates: js.Any = js.native
    
    var fonts: js.Any = js.native
    
    var height: Double = js.native
    
    var layout: String = js.native
    
    var margins: Bottom = js.native
    
    def maxY(): Double = js.native
    
    var patterns: js.Any = js.native
    
    var size: String = js.native
    
    var width: Double = js.native
    
    def write(chunk: js.Any): Unit = js.native
    
    var xobjects: js.Any = js.native
  }
  object PDFPage {
    
    @scala.inline
    def apply(
      annotations: js.Any,
      content: PDFKitReference,
      dictionary: PDFKitReference,
      document: PDFDocument,
      end: () => Unit,
      ext_gstates: js.Any,
      fonts: js.Any,
      height: Double,
      layout: String,
      margins: Bottom,
      maxY: () => Double,
      patterns: js.Any,
      size: String,
      width: Double,
      write: js.Any => Unit,
      xobjects: js.Any
    ): PDFPage = {
      val __obj = js.Dynamic.literal(annotations = annotations.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], dictionary = dictionary.asInstanceOf[js.Any], document = document.asInstanceOf[js.Any], end = js.Any.fromFunction0(end), ext_gstates = ext_gstates.asInstanceOf[js.Any], fonts = fonts.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], margins = margins.asInstanceOf[js.Any], maxY = js.Any.fromFunction0(maxY), patterns = patterns.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], write = js.Any.fromFunction1(write), xobjects = xobjects.asInstanceOf[js.Any])
      __obj.asInstanceOf[PDFPage]
    }
    
    @scala.inline
    implicit class PDFPageMutableBuilder[Self <: PDFPage] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnnotations(value: js.Any): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContent(value: PDFKitReference): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDictionary(value: PDFKitReference): Self = StObject.set(x, "dictionary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDocument(value: PDFDocument): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnd(value: () => Unit): Self = StObject.set(x, "end", js.Any.fromFunction0(value))
      
      @scala.inline
      def setExt_gstates(value: js.Any): Self = StObject.set(x, "ext_gstates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFonts(value: js.Any): Self = StObject.set(x, "fonts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLayout(value: String): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMargins(value: Bottom): Self = StObject.set(x, "margins", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxY(value: () => Double): Self = StObject.set(x, "maxY", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPatterns(value: js.Any): Self = StObject.set(x, "patterns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrite(value: js.Any => Unit): Self = StObject.set(x, "write", js.Any.fromFunction1(value))
      
      @scala.inline
      def setXobjects(value: js.Any): Self = StObject.set(x, "xobjects", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PDFRadialGradient
    extends PDFGradient
       with Instantiable5[
          /* document */ js.Any, 
          /* x1 */ Double, 
          /* y1 */ Double, 
          /* x2 */ Double, 
          /* y2 */ Double, 
          PDFRadialGradient
        ] {
    
    def opacityGradient(): PDFRadialGradient = js.native
    
    def shader(fn: js.Function0[_]): js.Any = js.native
  }
}
