package typingsSlinky.activexWord.Word

import typingsSlinky.activexStdole.stdole.DISPPARAMS
import typingsSlinky.activexStdole.stdole.EXCEPINFO
import typingsSlinky.activexStdole.stdole.GUID
import typingsSlinky.activexWord.activexWordStrings.Doc
import typingsSlinky.activexWord.activexWordStrings.bstrPaperFeed
import typingsSlinky.activexWord.activexWordStrings.bstrPrinterName
import typingsSlinky.activexWord.activexWordStrings.cpDeliveryAddrEnd
import typingsSlinky.activexWord.activexWordStrings.cpDeliveryAddrStart
import typingsSlinky.activexWord.activexWordStrings.cpReturnAddrEnd
import typingsSlinky.activexWord.activexWordStrings.cpReturnAddrStart
import typingsSlinky.activexWord.activexWordStrings.dispidMember
import typingsSlinky.activexWord.activexWordStrings.fCancel
import typingsSlinky.activexWord.activexWordStrings.fPrint
import typingsSlinky.activexWord.activexWordStrings.lcid
import typingsSlinky.activexWord.activexWordStrings.pdispparams
import typingsSlinky.activexWord.activexWordStrings.pexcepinfo
import typingsSlinky.activexWord.activexWordStrings.puArgErr
import typingsSlinky.activexWord.activexWordStrings.pvarResult
import typingsSlinky.activexWord.activexWordStrings.riid
import typingsSlinky.activexWord.activexWordStrings.wFlags
import typingsSlinky.activexWord.activexWordStrings.xaWidth
import typingsSlinky.activexWord.activexWordStrings.yaHeight
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object EventHelperTypes {
  
  type ApplicationEPostageInsertExArgNames = js.Tuple11[
    Doc, 
    cpDeliveryAddrStart, 
    cpDeliveryAddrEnd, 
    cpReturnAddrStart, 
    cpReturnAddrEnd, 
    xaWidth, 
    yaHeight, 
    bstrPrinterName, 
    bstrPaperFeed, 
    fPrint, 
    fCancel
  ]
  
  @js.native
  trait ApplicationEPostageInsertExParameter extends StObject {
    
    val Doc: Document = js.native
    
    val bstrPaperFeed: String = js.native
    
    val bstrPrinterName: String = js.native
    
    val cpDeliveryAddrEnd: Double = js.native
    
    val cpDeliveryAddrStart: Double = js.native
    
    val cpReturnAddrEnd: Double = js.native
    
    val cpReturnAddrStart: Double = js.native
    
    var fCancel: Boolean = js.native
    
    val fPrint: Boolean = js.native
    
    val xaWidth: Double = js.native
    
    val yaHeight: Double = js.native
  }
  object ApplicationEPostageInsertExParameter {
    
    @scala.inline
    def apply(
      Doc: Document,
      bstrPaperFeed: String,
      bstrPrinterName: String,
      cpDeliveryAddrEnd: Double,
      cpDeliveryAddrStart: Double,
      cpReturnAddrEnd: Double,
      cpReturnAddrStart: Double,
      fCancel: Boolean,
      fPrint: Boolean,
      xaWidth: Double,
      yaHeight: Double
    ): ApplicationEPostageInsertExParameter = {
      val __obj = js.Dynamic.literal(Doc = Doc.asInstanceOf[js.Any], bstrPaperFeed = bstrPaperFeed.asInstanceOf[js.Any], bstrPrinterName = bstrPrinterName.asInstanceOf[js.Any], cpDeliveryAddrEnd = cpDeliveryAddrEnd.asInstanceOf[js.Any], cpDeliveryAddrStart = cpDeliveryAddrStart.asInstanceOf[js.Any], cpReturnAddrEnd = cpReturnAddrEnd.asInstanceOf[js.Any], cpReturnAddrStart = cpReturnAddrStart.asInstanceOf[js.Any], fCancel = fCancel.asInstanceOf[js.Any], fPrint = fPrint.asInstanceOf[js.Any], xaWidth = xaWidth.asInstanceOf[js.Any], yaHeight = yaHeight.asInstanceOf[js.Any])
      __obj.asInstanceOf[ApplicationEPostageInsertExParameter]
    }
    
    @scala.inline
    implicit class ApplicationEPostageInsertExParameterMutableBuilder[Self <: ApplicationEPostageInsertExParameter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBstrPaperFeed(value: String): Self = StObject.set(x, "bstrPaperFeed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBstrPrinterName(value: String): Self = StObject.set(x, "bstrPrinterName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCpDeliveryAddrEnd(value: Double): Self = StObject.set(x, "cpDeliveryAddrEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCpDeliveryAddrStart(value: Double): Self = StObject.set(x, "cpDeliveryAddrStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCpReturnAddrEnd(value: Double): Self = StObject.set(x, "cpReturnAddrEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCpReturnAddrStart(value: Double): Self = StObject.set(x, "cpReturnAddrStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDoc(value: Document): Self = StObject.set(x, "Doc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFCancel(value: Boolean): Self = StObject.set(x, "fCancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFPrint(value: Boolean): Self = StObject.set(x, "fPrint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXaWidth(value: Double): Self = StObject.set(x, "xaWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYaHeight(value: Double): Self = StObject.set(x, "yaHeight", value.asInstanceOf[js.Any])
    }
  }
  
  type ApplicationInvokeArgNames = js.Tuple8[dispidMember, riid, lcid, wFlags, pdispparams, pvarResult, pexcepinfo, puArgErr]
  
  @js.native
  trait ApplicationInvokeParameter extends StObject {
    
    val dispidMember: Double = js.native
    
    val lcid: Double = js.native
    
    val pdispparams: DISPPARAMS = js.native
    
    var pexcepinfo: EXCEPINFO = js.native
    
    var puArgErr: Double = js.native
    
    var pvarResult: js.Any = js.native
    
    val riid: GUID = js.native
    
    val wFlags: Double = js.native
  }
  object ApplicationInvokeParameter {
    
    @scala.inline
    def apply(
      dispidMember: Double,
      lcid: Double,
      pdispparams: DISPPARAMS,
      pexcepinfo: EXCEPINFO,
      puArgErr: Double,
      pvarResult: js.Any,
      riid: GUID,
      wFlags: Double
    ): ApplicationInvokeParameter = {
      val __obj = js.Dynamic.literal(dispidMember = dispidMember.asInstanceOf[js.Any], lcid = lcid.asInstanceOf[js.Any], pdispparams = pdispparams.asInstanceOf[js.Any], pexcepinfo = pexcepinfo.asInstanceOf[js.Any], puArgErr = puArgErr.asInstanceOf[js.Any], pvarResult = pvarResult.asInstanceOf[js.Any], riid = riid.asInstanceOf[js.Any], wFlags = wFlags.asInstanceOf[js.Any])
      __obj.asInstanceOf[ApplicationInvokeParameter]
    }
    
    @scala.inline
    implicit class ApplicationInvokeParameterMutableBuilder[Self <: ApplicationInvokeParameter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDispidMember(value: Double): Self = StObject.set(x, "dispidMember", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLcid(value: Double): Self = StObject.set(x, "lcid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPdispparams(value: DISPPARAMS): Self = StObject.set(x, "pdispparams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPexcepinfo(value: EXCEPINFO): Self = StObject.set(x, "pexcepinfo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPuArgErr(value: Double): Self = StObject.set(x, "puArgErr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPvarResult(value: js.Any): Self = StObject.set(x, "pvarResult", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRiid(value: GUID): Self = StObject.set(x, "riid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWFlags(value: Double): Self = StObject.set(x, "wFlags", value.asInstanceOf[js.Any])
    }
  }
}
