package typingsSlinky.activexInfopath.InfoPath

import typingsSlinky.activexInfopath.activexInfopathStrings.dispidMember
import typingsSlinky.activexInfopath.activexInfopathStrings.lcid
import typingsSlinky.activexInfopath.activexInfopathStrings.pdispparams
import typingsSlinky.activexInfopath.activexInfopathStrings.pexcepinfo
import typingsSlinky.activexInfopath.activexInfopathStrings.puArgErr
import typingsSlinky.activexInfopath.activexInfopathStrings.pvarResult
import typingsSlinky.activexInfopath.activexInfopathStrings.riid
import typingsSlinky.activexInfopath.activexInfopathStrings.wFlags
import typingsSlinky.activexStdole.stdole.DISPPARAMS
import typingsSlinky.activexStdole.stdole.EXCEPINFO
import typingsSlinky.activexStdole.stdole.GUID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object EventHelperTypes {
  
  type ButtonInvokeArgNames = js.Tuple8[dispidMember, riid, lcid, wFlags, pdispparams, pvarResult, pexcepinfo, puArgErr]
  
  @js.native
  trait ButtonInvokeParameter extends StObject {
    
    val dispidMember: Double = js.native
    
    val lcid: Double = js.native
    
    val pdispparams: DISPPARAMS = js.native
    
    var pexcepinfo: EXCEPINFO = js.native
    
    var puArgErr: Double = js.native
    
    var pvarResult: js.Any = js.native
    
    val riid: GUID = js.native
    
    val wFlags: Double = js.native
  }
  object ButtonInvokeParameter {
    
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
    ): ButtonInvokeParameter = {
      val __obj = js.Dynamic.literal(dispidMember = dispidMember.asInstanceOf[js.Any], lcid = lcid.asInstanceOf[js.Any], pdispparams = pdispparams.asInstanceOf[js.Any], pexcepinfo = pexcepinfo.asInstanceOf[js.Any], puArgErr = puArgErr.asInstanceOf[js.Any], pvarResult = pvarResult.asInstanceOf[js.Any], riid = riid.asInstanceOf[js.Any], wFlags = wFlags.asInstanceOf[js.Any])
      __obj.asInstanceOf[ButtonInvokeParameter]
    }
    
    @scala.inline
    implicit class ButtonInvokeParameterMutableBuilder[Self <: ButtonInvokeParameter] (val x: Self) extends AnyVal {
      
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
  
  type DataDOMInvokeArgNames = js.Tuple8[dispidMember, riid, lcid, wFlags, pdispparams, pvarResult, pexcepinfo, puArgErr]
  
  @js.native
  trait DataDOMInvokeParameter extends StObject {
    
    val dispidMember: Double = js.native
    
    val lcid: Double = js.native
    
    val pdispparams: DISPPARAMS = js.native
    
    var pexcepinfo: EXCEPINFO = js.native
    
    var puArgErr: Double = js.native
    
    var pvarResult: js.Any = js.native
    
    val riid: GUID = js.native
    
    val wFlags: Double = js.native
  }
  object DataDOMInvokeParameter {
    
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
    ): DataDOMInvokeParameter = {
      val __obj = js.Dynamic.literal(dispidMember = dispidMember.asInstanceOf[js.Any], lcid = lcid.asInstanceOf[js.Any], pdispparams = pdispparams.asInstanceOf[js.Any], pexcepinfo = pexcepinfo.asInstanceOf[js.Any], puArgErr = puArgErr.asInstanceOf[js.Any], pvarResult = pvarResult.asInstanceOf[js.Any], riid = riid.asInstanceOf[js.Any], wFlags = wFlags.asInstanceOf[js.Any])
      __obj.asInstanceOf[DataDOMInvokeParameter]
    }
    
    @scala.inline
    implicit class DataDOMInvokeParameterMutableBuilder[Self <: DataDOMInvokeParameter] (val x: Self) extends AnyVal {
      
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
  
  type XDocumentInvokeArgNames = js.Tuple8[dispidMember, riid, lcid, wFlags, pdispparams, pvarResult, pexcepinfo, puArgErr]
  
  @js.native
  trait XDocumentInvokeParameter extends StObject {
    
    val dispidMember: Double = js.native
    
    val lcid: Double = js.native
    
    val pdispparams: DISPPARAMS = js.native
    
    var pexcepinfo: EXCEPINFO = js.native
    
    var puArgErr: Double = js.native
    
    var pvarResult: js.Any = js.native
    
    val riid: GUID = js.native
    
    val wFlags: Double = js.native
  }
  object XDocumentInvokeParameter {
    
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
    ): XDocumentInvokeParameter = {
      val __obj = js.Dynamic.literal(dispidMember = dispidMember.asInstanceOf[js.Any], lcid = lcid.asInstanceOf[js.Any], pdispparams = pdispparams.asInstanceOf[js.Any], pexcepinfo = pexcepinfo.asInstanceOf[js.Any], puArgErr = puArgErr.asInstanceOf[js.Any], pvarResult = pvarResult.asInstanceOf[js.Any], riid = riid.asInstanceOf[js.Any], wFlags = wFlags.asInstanceOf[js.Any])
      __obj.asInstanceOf[XDocumentInvokeParameter]
    }
    
    @scala.inline
    implicit class XDocumentInvokeParameterMutableBuilder[Self <: XDocumentInvokeParameter] (val x: Self) extends AnyVal {
      
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
