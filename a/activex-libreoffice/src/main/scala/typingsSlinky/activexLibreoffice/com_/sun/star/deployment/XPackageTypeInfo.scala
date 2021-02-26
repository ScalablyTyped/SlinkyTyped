package typingsSlinky.activexLibreoffice.com_.sun.star.deployment

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Objects of this interface provide information about a package's type.
  * @since OOo 2.0
  */
@js.native
trait XPackageTypeInfo extends StObject {
  
  /**
    * returns a description string to describe a package type.
    * @returns description
    */
  val Description: String = js.native
  
  /**
    * returns a file filter string for the file picker user interface. Both, the short description string and file filter string will be passed to {@link
    * com.sun.star.ui.dialogs.XFilterManager.appendFilter()} .
    * @returns file filter string
    */
  val FileFilter: String = js.native
  
  /**
    * returns the media type of a package, e.g. `application/vnd.sun.star.basic-script` .
    * @returns media type of package
    */
  val MediaType: String = js.native
  
  /**
    * returns a short description string to describe a package type (one line only).
    * @returns description
    */
  val ShortDescription: String = js.native
  
  /**
    * returns a description string to describe a package type.
    * @returns description
    */
  def getDescription(): String = js.native
  
  /**
    * returns a file filter string for the file picker user interface. Both, the short description string and file filter string will be passed to {@link
    * com.sun.star.ui.dialogs.XFilterManager.appendFilter()} .
    * @returns file filter string
    */
  def getFileFilter(): String = js.native
  
  /**
    * returns an icon for a package.
    * @param highContrast return high contrast icon
    * @param smallIcon return a small icon (e.g. 16x16 pixel), else return a big one (e.g. 26x26 pixel)
    * @returns currently an unsigned short (resource id for deploymentgui resource file), `VOID` any if none is available
    */
  def getIcon(highContrast: Boolean, smallIcon: Boolean): js.Any = js.native
  
  /**
    * returns the media type of a package, e.g. `application/vnd.sun.star.basic-script` .
    * @returns media type of package
    */
  def getMediaType(): String = js.native
  
  /**
    * returns a short description string to describe a package type (one line only).
    * @returns description
    */
  def getShortDescription(): String = js.native
}
object XPackageTypeInfo {
  
  @scala.inline
  def apply(
    Description: String,
    FileFilter: String,
    MediaType: String,
    ShortDescription: String,
    getDescription: () => String,
    getFileFilter: () => String,
    getIcon: (Boolean, Boolean) => js.Any,
    getMediaType: () => String,
    getShortDescription: () => String
  ): XPackageTypeInfo = {
    val __obj = js.Dynamic.literal(Description = Description.asInstanceOf[js.Any], FileFilter = FileFilter.asInstanceOf[js.Any], MediaType = MediaType.asInstanceOf[js.Any], ShortDescription = ShortDescription.asInstanceOf[js.Any], getDescription = js.Any.fromFunction0(getDescription), getFileFilter = js.Any.fromFunction0(getFileFilter), getIcon = js.Any.fromFunction2(getIcon), getMediaType = js.Any.fromFunction0(getMediaType), getShortDescription = js.Any.fromFunction0(getShortDescription))
    __obj.asInstanceOf[XPackageTypeInfo]
  }
  
  @scala.inline
  implicit class XPackageTypeInfoMutableBuilder[Self <: XPackageTypeInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileFilter(value: String): Self = StObject.set(x, "FileFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetDescription(value: () => String): Self = StObject.set(x, "getDescription", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetFileFilter(value: () => String): Self = StObject.set(x, "getFileFilter", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetIcon(value: (Boolean, Boolean) => js.Any): Self = StObject.set(x, "getIcon", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetMediaType(value: () => String): Self = StObject.set(x, "getMediaType", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetShortDescription(value: () => String): Self = StObject.set(x, "getShortDescription", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMediaType(value: String): Self = StObject.set(x, "MediaType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShortDescription(value: String): Self = StObject.set(x, "ShortDescription", value.asInstanceOf[js.Any])
  }
}
