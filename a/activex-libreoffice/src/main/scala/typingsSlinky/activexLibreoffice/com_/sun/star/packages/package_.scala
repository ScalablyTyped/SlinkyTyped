package typingsSlinky.activexLibreoffice.com_.sun.star

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object packages {
  
  /** This exception can be thrown in case object is encrypted when it is not allowed */
  type EncryptionNotAllowedException = typingsSlinky.activexLibreoffice.com_.sun.star.uno.Exception
  
  /** This exception can be thrown in case object is not encrypted one as expected. */
  type NoEncryptionException = typingsSlinky.activexLibreoffice.com_.sun.star.uno.Exception
  
  /** This exception can be thrown in case provided stream is not a raw stream representing encrypted package stream. */
  type NoRawFormatException = typingsSlinky.activexLibreoffice.com_.sun.star.io.IOException
  
  /**
    * This service provides an iterator over the contents of a given instance of a {@link PackageFolder} . This provides a "snapshot" of the contents of the
    * {@link PackageFolder} at the time of construction. It is the responsibility of the caller to ensure that any given member of the enumeration refers to
    * a valid {@link PackageStream} or {@link PackageFolder} .
    */
  type PackageFolderEnumeration = typingsSlinky.activexLibreoffice.com_.sun.star.container.XEnumeration
  
  /** This exception can be thrown in case wrong password was provided. */
  type WrongPasswordException = typingsSlinky.activexLibreoffice.com_.sun.star.uno.Exception
}
