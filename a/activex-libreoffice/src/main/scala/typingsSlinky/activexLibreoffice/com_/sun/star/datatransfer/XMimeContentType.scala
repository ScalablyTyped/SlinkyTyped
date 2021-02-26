package typingsSlinky.activexLibreoffice.com_.sun.star.datatransfer

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsSlinky.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An implementation of this interface represents a MIME content-type that conforms to [Rfc2045]{@link url="ftp://ftp.isi.edu/in-notes/rfc2045.txt"} and
  * [Rfc2046]{@link url="ftp://ftp.isi.edu/in-notes/rfc2046.txt"} . Instances that implement this interface could be created using the interface {@link
  * XMimeContentTypeFactory} .
  */
@js.native
trait XMimeContentType extends XInterface {
  
  /**
    * To get the full media/submedia type of the MIME content-type.
    * @returns The full media/submedia type of the MIME content-type.
    */
  val FullMediaType: String = js.native
  
  /**
    * To get the media subtype of the MIME content-type.
    * @returns The media subtype of the MIME content-type.
    */
  val MediaSubtype: String = js.native
  
  /**
    * To get the media type of the MIME content-type.
    * @returns The media type of the MIME content-type.
    */
  val MediaType: String = js.native
  
  /**
    * To get a list of parameters that the MIME content-type contains.
    * @returns A list of the names of all parameters of the MIME content-type.
    */
  val Parameters: SafeArray[String] = js.native
  
  /**
    * To get the full media/submedia type of the MIME content-type.
    * @returns The full media/submedia type of the MIME content-type.
    */
  def getFullMediaType(): String = js.native
  
  /**
    * To get the media subtype of the MIME content-type.
    * @returns The media subtype of the MIME content-type.
    */
  def getMediaSubtype(): String = js.native
  
  /**
    * To get the media type of the MIME content-type.
    * @returns The media type of the MIME content-type.
    */
  def getMediaType(): String = js.native
  
  /**
    * To get the value of a specified parameter.
    * @param aName The name of the parameter for which the value is requested.
    * @returns The value of the specified parameter.
    * @throws com::sun::star::container::NoSuchElementException if the specified parameter doesn't exist.
    */
  def getParameterValue(aName: String): String = js.native
  
  /**
    * To get a list of parameters that the MIME content-type contains.
    * @returns A list of the names of all parameters of the MIME content-type.
    */
  def getParameters(): SafeArray[String] = js.native
  
  /**
    * To query if a specific parameter is supported.
    * @param aName The name of the parameter to query for.
    * @returns A value of `TRUE` if the MIME content-type has the specified parameter. A value of `FALSE` if the MIME content-type has not the specified parameter.
    */
  def hasParameter(aName: String): Boolean = js.native
}
object XMimeContentType {
  
  @scala.inline
  def apply(
    FullMediaType: String,
    MediaSubtype: String,
    MediaType: String,
    Parameters: SafeArray[String],
    acquire: () => Unit,
    getFullMediaType: () => String,
    getMediaSubtype: () => String,
    getMediaType: () => String,
    getParameterValue: String => String,
    getParameters: () => SafeArray[String],
    hasParameter: String => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XMimeContentType = {
    val __obj = js.Dynamic.literal(FullMediaType = FullMediaType.asInstanceOf[js.Any], MediaSubtype = MediaSubtype.asInstanceOf[js.Any], MediaType = MediaType.asInstanceOf[js.Any], Parameters = Parameters.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getFullMediaType = js.Any.fromFunction0(getFullMediaType), getMediaSubtype = js.Any.fromFunction0(getMediaSubtype), getMediaType = js.Any.fromFunction0(getMediaType), getParameterValue = js.Any.fromFunction1(getParameterValue), getParameters = js.Any.fromFunction0(getParameters), hasParameter = js.Any.fromFunction1(hasParameter), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XMimeContentType]
  }
  
  @scala.inline
  implicit class XMimeContentTypeMutableBuilder[Self <: XMimeContentType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFullMediaType(value: String): Self = StObject.set(x, "FullMediaType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetFullMediaType(value: () => String): Self = StObject.set(x, "getFullMediaType", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMediaSubtype(value: () => String): Self = StObject.set(x, "getMediaSubtype", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMediaType(value: () => String): Self = StObject.set(x, "getMediaType", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetParameterValue(value: String => String): Self = StObject.set(x, "getParameterValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetParameters(value: () => SafeArray[String]): Self = StObject.set(x, "getParameters", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHasParameter(value: String => Boolean): Self = StObject.set(x, "hasParameter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMediaSubtype(value: String): Self = StObject.set(x, "MediaSubtype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaType(value: String): Self = StObject.set(x, "MediaType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameters(value: SafeArray[String]): Self = StObject.set(x, "Parameters", value.asInstanceOf[js.Any])
  }
}
