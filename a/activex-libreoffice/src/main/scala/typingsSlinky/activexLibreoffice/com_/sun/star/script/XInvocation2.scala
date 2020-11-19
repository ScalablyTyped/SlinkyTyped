package typingsSlinky.activexLibreoffice.com_.sun.star.script

import typingsSlinky.activexLibreoffice.LibreOffice.SeqEquiv
import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XIntrospectionAccess
import typingsSlinky.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Extension of {@link XInvocation} to provide additional information about the methods and properties that are accessible via {@link XInvocation} . */
@js.native
trait XInvocation2 extends XInvocation {
  
  /**
    * returns information items for all methods and properties accessible via {@link XInvocation} .
    * @see com.sun.star.script.Invocation
    */
  val Info: SafeArray[InvocationInfo] = js.native
  
  /** returns the names of all methods and properties accessible via {@link XInvocation} . */
  val MemberNames: SafeArray[String] = js.native
  
  /**
    * returns information items for all methods and properties accessible via {@link XInvocation} .
    * @see com.sun.star.script.Invocation
    */
  def getInfo(): SafeArray[InvocationInfo] = js.native
  
  /**
    * returns information item for the method or property defined by aName
    * @param aName specifies the name of the method or property
    * @param bExact specifies the name of the method or property
    * @see com.sun.star.script.Invocation
    * @throws IllegalArgumentException if aName is not the name of a supported method or property
    */
  def getInfoForName(aName: String, bExact: Boolean): InvocationInfo = js.native
  
  /** returns the names of all methods and properties accessible via {@link XInvocation} . */
  def getMemberNames(): SafeArray[String] = js.native
}
object XInvocation2 {
  
  @scala.inline
  def apply(
    Info: SafeArray[InvocationInfo],
    Introspection: XIntrospectionAccess,
    MemberNames: SafeArray[String],
    acquire: () => Unit,
    getInfo: () => SafeArray[InvocationInfo],
    getInfoForName: (String, Boolean) => InvocationInfo,
    getIntrospection: () => XIntrospectionAccess,
    getMemberNames: () => SafeArray[String],
    getValue: String => js.Any,
    hasMethod: String => Boolean,
    hasProperty: String => Boolean,
    invoke: (String, SeqEquiv[_], js.Array[SeqEquiv[Double]], js.Array[SeqEquiv[_]]) => js.Any,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setValue: (String, js.Any) => Unit
  ): XInvocation2 = {
    val __obj = js.Dynamic.literal(Info = Info.asInstanceOf[js.Any], Introspection = Introspection.asInstanceOf[js.Any], MemberNames = MemberNames.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getInfo = js.Any.fromFunction0(getInfo), getInfoForName = js.Any.fromFunction2(getInfoForName), getIntrospection = js.Any.fromFunction0(getIntrospection), getMemberNames = js.Any.fromFunction0(getMemberNames), getValue = js.Any.fromFunction1(getValue), hasMethod = js.Any.fromFunction1(hasMethod), hasProperty = js.Any.fromFunction1(hasProperty), invoke = js.Any.fromFunction4(invoke), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setValue = js.Any.fromFunction2(setValue))
    __obj.asInstanceOf[XInvocation2]
  }
  
  @scala.inline
  implicit class XInvocation2Ops[Self <: XInvocation2] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setInfo(value: SafeArray[InvocationInfo]): Self = this.set("Info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemberNames(value: SafeArray[String]): Self = this.set("MemberNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetInfo(value: () => SafeArray[InvocationInfo]): Self = this.set("getInfo", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetInfoForName(value: (String, Boolean) => InvocationInfo): Self = this.set("getInfoForName", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetMemberNames(value: () => SafeArray[String]): Self = this.set("getMemberNames", js.Any.fromFunction0(value))
  }
}
