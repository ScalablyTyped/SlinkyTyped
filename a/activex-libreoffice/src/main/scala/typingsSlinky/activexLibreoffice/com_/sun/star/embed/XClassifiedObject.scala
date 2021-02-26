package typingsSlinky.activexLibreoffice.com_.sun.star.embed

import typingsSlinky.activexLibreoffice.LibreOffice.SeqEquiv
import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsSlinky.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** represents common functionality for embedded objects */
@js.native
trait XClassifiedObject extends XInterface {
  
  /**
    * retrieves class ID of the object.
    * @returns unique class ID of the object
    */
  val ClassID: SafeArray[Double] = js.native
  
  /**
    * retrieves symbolic name for the object type to be used in UI.
    * @returns the symbolic name for the object
    */
  val ClassName: String = js.native
  
  /**
    * retrieves class ID of the object.
    * @returns unique class ID of the object
    */
  def getClassID(): SafeArray[Double] = js.native
  
  /**
    * retrieves symbolic name for the object type to be used in UI.
    * @returns the symbolic name for the object
    */
  def getClassName(): String = js.native
  
  /**
    * sets the class ID and symbolic name to an object.
    * @param aClassID the new class ID
    * @param sClassName the new symbolic name
    * @throws com::sun::star::lang::NoSupportException in case changing of class information is not allowed
    */
  def setClassInfo(aClassID: SeqEquiv[Double], sClassName: String): Unit = js.native
}
object XClassifiedObject {
  
  @scala.inline
  def apply(
    ClassID: SafeArray[Double],
    ClassName: String,
    acquire: () => Unit,
    getClassID: () => SafeArray[Double],
    getClassName: () => String,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setClassInfo: (SeqEquiv[Double], String) => Unit
  ): XClassifiedObject = {
    val __obj = js.Dynamic.literal(ClassID = ClassID.asInstanceOf[js.Any], ClassName = ClassName.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getClassID = js.Any.fromFunction0(getClassID), getClassName = js.Any.fromFunction0(getClassName), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setClassInfo = js.Any.fromFunction2(setClassInfo))
    __obj.asInstanceOf[XClassifiedObject]
  }
  
  @scala.inline
  implicit class XClassifiedObjectMutableBuilder[Self <: XClassifiedObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassID(value: SafeArray[Double]): Self = StObject.set(x, "ClassID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "ClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetClassID(value: () => SafeArray[Double]): Self = StObject.set(x, "getClassID", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetClassName(value: () => String): Self = StObject.set(x, "getClassName", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetClassInfo(value: (SeqEquiv[Double], String) => Unit): Self = StObject.set(x, "setClassInfo", js.Any.fromFunction2(value))
  }
}
