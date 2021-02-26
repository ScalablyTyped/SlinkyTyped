package typingsSlinky.activexLibreoffice.com_.sun.star

import typingsSlinky.activexLibreoffice.LibreOffice.SeqEquiv
import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`-1`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`0`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`101010256`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`10`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`12`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`134695760`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`14`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`16`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`18`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`1`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`20`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`22`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`24`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`26`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`28`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`2`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`30`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`32`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`33639248`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`34`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`36`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`38`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`42`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`46`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`4`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`67324752`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`6`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`8`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`9`
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typingsSlinky.activexLibreoffice.com_.sun.star.container.XChild
import typingsSlinky.activexLibreoffice.com_.sun.star.container.XEnumeration
import typingsSlinky.activexLibreoffice.com_.sun.star.container.XEnumerationAccess
import typingsSlinky.activexLibreoffice.com_.sun.star.container.XHierarchicalNameAccess
import typingsSlinky.activexLibreoffice.com_.sun.star.container.XNameAccess
import typingsSlinky.activexLibreoffice.com_.sun.star.container.XNameContainer
import typingsSlinky.activexLibreoffice.com_.sun.star.container.XNamed
import typingsSlinky.activexLibreoffice.com_.sun.star.io.IOException
import typingsSlinky.activexLibreoffice.com_.sun.star.io.XActiveDataSink
import typingsSlinky.activexLibreoffice.com_.sun.star.io.XInputStream
import typingsSlinky.activexLibreoffice.com_.sun.star.io.XOutputStream
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.XInitialization
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.XSingleServiceFactory
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.Exception
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsSlinky.activexLibreoffice.com_.sun.star.util.ChangesSet
import typingsSlinky.activexLibreoffice.com_.sun.star.util.XChangesBatch
import typingsSlinky.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object packages {
  
  /** This exception can be thrown in case object is encrypted when it is not allowed */
  type EncryptionNotAllowedException = Exception
  
  /** This exception can be thrown in case object is not encrypted one as expected. */
  type NoEncryptionException = Exception
  
  /** This exception can be thrown in case provided stream is not a raw stream representing encrypted package stream. */
  type NoRawFormatException = IOException
  
  /**
    * The {@link Package} is a service that provides access to a set of files and folders contained within a {@link Package} . One instance of the {@link
    * Package} service exists for each {@link Package} file to be manipulated.
    *
    * Each instance is created with an argument which specifies the URL of the {@link Package} file to which the user requires access. If the instance is
    * created without arguments, it must be initialized with the {@link com.sun.star.lang.XInitialization} service methods before it is a valid instance of
    * the service.
    */
  @js.native
  trait Package
    extends XInitialization
       with XHierarchicalNameAccess
       with XSingleServiceFactory
       with XChangesBatch
  object Package {
    
    @scala.inline
    def apply(
      PendingChanges: ChangesSet,
      acquire: () => Unit,
      commitChanges: () => Unit,
      createInstance: () => XInterface,
      createInstanceWithArguments: SeqEquiv[_] => XInterface,
      getByHierarchicalName: String => js.Any,
      getPendingChanges: () => ChangesSet,
      hasByHierarchicalName: String => Boolean,
      hasPendingChanges: () => Boolean,
      initialize: SeqEquiv[_] => Unit,
      queryInterface: `type` => js.Any,
      release: () => Unit
    ): Package = {
      val __obj = js.Dynamic.literal(PendingChanges = PendingChanges.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), commitChanges = js.Any.fromFunction0(commitChanges), createInstance = js.Any.fromFunction0(createInstance), createInstanceWithArguments = js.Any.fromFunction1(createInstanceWithArguments), getByHierarchicalName = js.Any.fromFunction1(getByHierarchicalName), getPendingChanges = js.Any.fromFunction0(getPendingChanges), hasByHierarchicalName = js.Any.fromFunction1(hasByHierarchicalName), hasPendingChanges = js.Any.fromFunction0(hasPendingChanges), initialize = js.Any.fromFunction1(initialize), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
      __obj.asInstanceOf[Package]
    }
  }
  
  /**
    * The {@link PackageFolder} service represents a single folder or directory within a {@link Package} . Instances of this service can only be constructed
    * by an implementation of the {@link Package} service and not via the service manager.
    */
  @js.native
  trait PackageFolder
    extends XNameContainer
       with XNamed
       with XChild
       with XEnumerationAccess
       with XPropertySet
  object PackageFolder {
    
    @scala.inline
    def apply(
      ElementNames: SafeArray[String],
      ElementType: `type`,
      Name: String,
      Parent: XInterface,
      PropertySetInfo: XPropertySetInfo,
      acquire: () => Unit,
      addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
      addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
      createEnumeration: () => XEnumeration,
      getByName: String => js.Any,
      getElementNames: () => SafeArray[String],
      getElementType: () => `type`,
      getName: () => String,
      getParent: () => XInterface,
      getPropertySetInfo: () => XPropertySetInfo,
      getPropertyValue: String => js.Any,
      hasByName: String => Boolean,
      hasElements: () => Boolean,
      insertByName: (String, js.Any) => Unit,
      queryInterface: `type` => js.Any,
      release: () => Unit,
      removeByName: String => Unit,
      removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
      removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
      replaceByName: (String, js.Any) => Unit,
      setName: String => Unit,
      setParent: XInterface => Unit,
      setPropertyValue: (String, js.Any) => Unit
    ): PackageFolder = {
      val __obj = js.Dynamic.literal(ElementNames = ElementNames.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), createEnumeration = js.Any.fromFunction0(createEnumeration), getByName = js.Any.fromFunction1(getByName), getElementNames = js.Any.fromFunction0(getElementNames), getElementType = js.Any.fromFunction0(getElementType), getName = js.Any.fromFunction0(getName), getParent = js.Any.fromFunction0(getParent), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), hasByName = js.Any.fromFunction1(hasByName), hasElements = js.Any.fromFunction0(hasElements), insertByName = js.Any.fromFunction2(insertByName), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeByName = js.Any.fromFunction1(removeByName), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), replaceByName = js.Any.fromFunction2(replaceByName), setName = js.Any.fromFunction1(setName), setParent = js.Any.fromFunction1(setParent), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
      __obj.asInstanceOf[PackageFolder]
    }
  }
  
  /**
    * This service provides an iterator over the contents of a given instance of a {@link PackageFolder} . This provides a "snapshot" of the contents of the
    * {@link PackageFolder} at the time of construction. It is the responsibility of the caller to ensure that any given member of the enumeration refers to
    * a valid {@link PackageStream} or {@link PackageFolder} .
    */
  type PackageFolderEnumeration = XEnumeration
  
  /**
    * This service represents a stream contained within a {@link Package} . Instances of this class can only be constructed by the implementation of the
    * {@link Package} service.
    */
  @js.native
  trait PackageStream
    extends XNamed
       with XChild
       with XActiveDataSink
       with XPropertySet
  object PackageStream {
    
    @scala.inline
    def apply(
      InputStream: XInputStream,
      Name: String,
      Parent: XInterface,
      PropertySetInfo: XPropertySetInfo,
      acquire: () => Unit,
      addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
      addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
      getInputStream: () => XInputStream,
      getName: () => String,
      getParent: () => XInterface,
      getPropertySetInfo: () => XPropertySetInfo,
      getPropertyValue: String => js.Any,
      queryInterface: `type` => js.Any,
      release: () => Unit,
      removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
      removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
      setInputStream: XInputStream => Unit,
      setName: String => Unit,
      setParent: XInterface => Unit,
      setPropertyValue: (String, js.Any) => Unit
    ): PackageStream = {
      val __obj = js.Dynamic.literal(InputStream = InputStream.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), getInputStream = js.Any.fromFunction0(getInputStream), getName = js.Any.fromFunction0(getName), getParent = js.Any.fromFunction0(getParent), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setInputStream = js.Any.fromFunction1(setInputStream), setName = js.Any.fromFunction1(setName), setParent = js.Any.fromFunction1(setParent), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
      __obj.asInstanceOf[PackageStream]
    }
  }
  
  /** This exception can be thrown in case wrong password was provided. */
  type WrongPasswordException = Exception
  
  /** Allows to get access to the stream of a {@link PackageStream} . */
  @js.native
  trait XDataSinkEncrSupport extends XInterface {
    
    /**
      * Allows to get access to the data of the {@link PackageStream} .
      *
      * In case stream is encrypted one and the key for the stream is not set, an exception must be thrown.
      * @returns the stream
      * @throws com::sun::star::packages::WrongPasswordException no key or a wrong one is set
      * @throws com::sun::star::io::IOException in case of io problems during retrieving
      */
    var DataStream: XInputStream = js.native
    
    /**
      * Allows to get access to the raw data of the stream as it is stored in the package.
      * @returns the plain raw stream as it is stored in the package
      * @throws com::sun::star::packages::NoEncryptionException the {@link PackageStream} object is not encrypted
      * @throws com::sun::star::io::IOException in case of io problems during retrieving
      */
    val PlainRawStream: XInputStream = js.native
    
    /**
      * Allows to get access to the data of the {@link PackageStream} as to raw stream. In case stream is not encrypted an exception will be thrown.
      *
      * The difference of raw stream is that it contains header for encrypted data, so an encrypted stream can be copied from one {@link PackageStream} to
      * another one without decryption.
      * @returns the raw representation of stream
      * @throws com::sun::star::packages::NoEncryptionException the {@link PackageStream} object is not encrypted
      * @throws com::sun::star::io::IOException in case of io problems during retrieving
      */
    var RawStream: XInputStream = js.native
    
    /**
      * Allows to get access to the data of the {@link PackageStream} .
      *
      * In case stream is encrypted one and the key for the stream is not set, an exception must be thrown.
      * @returns the stream
      * @throws com::sun::star::packages::WrongPasswordException no key or a wrong one is set
      * @throws com::sun::star::io::IOException in case of io problems during retrieving
      */
    def getDataStream(): XInputStream = js.native
    
    /**
      * Allows to get access to the raw data of the stream as it is stored in the package.
      * @returns the plain raw stream as it is stored in the package
      * @throws com::sun::star::packages::NoEncryptionException the {@link PackageStream} object is not encrypted
      * @throws com::sun::star::io::IOException in case of io problems during retrieving
      */
    def getPlainRawStream(): XInputStream = js.native
    
    /**
      * Allows to get access to the data of the {@link PackageStream} as to raw stream. In case stream is not encrypted an exception will be thrown.
      *
      * The difference of raw stream is that it contains header for encrypted data, so an encrypted stream can be copied from one {@link PackageStream} to
      * another one without decryption.
      * @returns the raw representation of stream
      * @throws com::sun::star::packages::NoEncryptionException the {@link PackageStream} object is not encrypted
      * @throws com::sun::star::io::IOException in case of io problems during retrieving
      */
    def getRawStream(): XInputStream = js.native
    
    /**
      * Allows to set a data stream for the {@link PackageStream} .
      *
      * In case {@link PackageStream} is marked as encrypted the data stream will be encrypted on storing.
      * @param aStream new data stream
      * @throws com::sun::star::io::IOException in case of io problems
      */
    def setDataStream(aStream: XInputStream): Unit = js.native
    
    /**
      * Allows to set raw stream for the {@link PackageStream} . The {@link PackageStream} object can not be marked as encrypted one, an exception will be
      * thrown in such case.
      * @param aStream the new raw representation of stream
      * @throws com::sun::star::packages::EncryptionNotAllowedException the {@link PackageStream} object is marked as encrypted
      * @throws com::sun::star::packages::NoRawFormatException the stream is not a correct raw representation of encrypted package stream
      * @throws com::sun::star::io::IOException in case of io problems during retrieving
      */
    def setRawStream(aStream: XInputStream): Unit = js.native
  }
  object XDataSinkEncrSupport {
    
    @scala.inline
    def apply(
      DataStream: XInputStream,
      PlainRawStream: XInputStream,
      RawStream: XInputStream,
      acquire: () => Unit,
      getDataStream: () => XInputStream,
      getPlainRawStream: () => XInputStream,
      getRawStream: () => XInputStream,
      queryInterface: `type` => js.Any,
      release: () => Unit,
      setDataStream: XInputStream => Unit,
      setRawStream: XInputStream => Unit
    ): XDataSinkEncrSupport = {
      val __obj = js.Dynamic.literal(DataStream = DataStream.asInstanceOf[js.Any], PlainRawStream = PlainRawStream.asInstanceOf[js.Any], RawStream = RawStream.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getDataStream = js.Any.fromFunction0(getDataStream), getPlainRawStream = js.Any.fromFunction0(getPlainRawStream), getRawStream = js.Any.fromFunction0(getRawStream), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setDataStream = js.Any.fromFunction1(setDataStream), setRawStream = js.Any.fromFunction1(setRawStream))
      __obj.asInstanceOf[XDataSinkEncrSupport]
    }
    
    @scala.inline
    implicit class XDataSinkEncrSupportMutableBuilder[Self <: XDataSinkEncrSupport] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDataStream(value: XInputStream): Self = StObject.set(x, "DataStream", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetDataStream(value: () => XInputStream): Self = StObject.set(x, "getDataStream", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetPlainRawStream(value: () => XInputStream): Self = StObject.set(x, "getPlainRawStream", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetRawStream(value: () => XInputStream): Self = StObject.set(x, "getRawStream", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPlainRawStream(value: XInputStream): Self = StObject.set(x, "PlainRawStream", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRawStream(value: XInputStream): Self = StObject.set(x, "RawStream", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetDataStream(value: XInputStream => Unit): Self = StObject.set(x, "setDataStream", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetRawStream(value: XInputStream => Unit): Self = StObject.set(x, "setRawStream", js.Any.fromFunction1(value))
    }
  }
  
  object manifest {
    
    type ManifestReader = XManifestReader
    
    type ManifestWriter = XManifestWriter
    
    /**
      * This interface reads the manifest data from a file. The user must supply an XInputStream when calling {@link readManifestSequence()} to receive a
      * sequence of manifest entries. Each manifest entry is represented by a sequence of PropertyValues.
      */
    @js.native
    trait XManifestReader extends XInterface {
      
      /** Supplies the {@link XManifestReader} with an XInputStream to read from, reads the data and returns it to the caller. */
      def readManifestSequence(rStream: XInputStream): SafeArray[SafeArray[PropertyValue]] = js.native
    }
    object XManifestReader {
      
      @scala.inline
      def apply(
        acquire: () => Unit,
        queryInterface: `type` => js.Any,
        readManifestSequence: XInputStream => SafeArray[SafeArray[PropertyValue]],
        release: () => Unit
      ): XManifestReader = {
        val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), readManifestSequence = js.Any.fromFunction1(readManifestSequence), release = js.Any.fromFunction0(release))
        __obj.asInstanceOf[XManifestReader]
      }
      
      @scala.inline
      implicit class XManifestReaderMutableBuilder[Self <: XManifestReader] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setReadManifestSequence(value: XInputStream => SafeArray[SafeArray[PropertyValue]]): Self = StObject.set(x, "readManifestSequence", js.Any.fromFunction1(value))
      }
    }
    
    /**
      * This interface writes the manifest data to a file. The user calls {@link writeManifestSequence()} with the XOutputStream to write the data to and the
      * sequence of manifest entries to be written passed as parameters. Each manifest entry is represented by a sequence of PropertyValues.
      */
    @js.native
    trait XManifestWriter extends XInterface {
      
      /** Writes the supplied sequence of manifest entries to the supplied XOutputStream */
      def writeManifestSequence(rStream: XOutputStream, rSequence: SeqEquiv[SeqEquiv[PropertyValue]]): Unit = js.native
    }
    object XManifestWriter {
      
      @scala.inline
      def apply(
        acquire: () => Unit,
        queryInterface: `type` => js.Any,
        release: () => Unit,
        writeManifestSequence: (XOutputStream, SeqEquiv[SeqEquiv[PropertyValue]]) => Unit
      ): XManifestWriter = {
        val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), writeManifestSequence = js.Any.fromFunction2(writeManifestSequence))
        __obj.asInstanceOf[XManifestWriter]
      }
      
      @scala.inline
      implicit class XManifestWriterMutableBuilder[Self <: XManifestWriter] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setWriteManifestSequence(value: (XOutputStream, SeqEquiv[SeqEquiv[PropertyValue]]) => Unit): Self = StObject.set(x, "writeManifestSequence", js.Any.fromFunction2(value))
      }
    }
  }
  
  object zip {
    
    /** allows to get reading access to non-encrypted entries inside zip file. */
    @js.native
    trait XZipFileAccess extends XInterface {
      
      /**
        * allows to get stream by specifying a pattern.
        *
        * The first stream with a name that fits to the pattern will be returned. The pattern allows to use "*" wildcard symbol. If the name contains "*" or "\"
        * symbols itself they must guarded with backslash "\". The slashes have no special meaning here so they can be replaced by wildcards also.
        */
      def getStreamByPattern(aPattern: String): XInputStream = js.native
    }
    object XZipFileAccess {
      
      @scala.inline
      def apply(
        acquire: () => Unit,
        getStreamByPattern: String => XInputStream,
        queryInterface: `type` => js.Any,
        release: () => Unit
      ): XZipFileAccess = {
        val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getStreamByPattern = js.Any.fromFunction1(getStreamByPattern), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
        __obj.asInstanceOf[XZipFileAccess]
      }
      
      @scala.inline
      implicit class XZipFileAccessMutableBuilder[Self <: XZipFileAccess] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setGetStreamByPattern(value: String => XInputStream): Self = StObject.set(x, "getStreamByPattern", js.Any.fromFunction1(value))
      }
    }
    
    /**
      * Merged interface for {@link ZipFileAccess} service.
      * @since LibreOffice 4.1
      */
    @js.native
    trait XZipFileAccess2
      extends XNameAccess
         with XZipFileAccess
    object XZipFileAccess2 {
      
      @scala.inline
      def apply(
        ElementNames: SafeArray[String],
        ElementType: `type`,
        acquire: () => Unit,
        getByName: String => js.Any,
        getElementNames: () => SafeArray[String],
        getElementType: () => `type`,
        getStreamByPattern: String => XInputStream,
        hasByName: String => Boolean,
        hasElements: () => Boolean,
        queryInterface: `type` => js.Any,
        release: () => Unit
      ): XZipFileAccess2 = {
        val __obj = js.Dynamic.literal(ElementNames = ElementNames.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getByName = js.Any.fromFunction1(getByName), getElementNames = js.Any.fromFunction0(getElementNames), getElementType = js.Any.fromFunction0(getElementType), getStreamByPattern = js.Any.fromFunction1(getStreamByPattern), hasByName = js.Any.fromFunction1(hasByName), hasElements = js.Any.fromFunction0(hasElements), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
        __obj.asInstanceOf[XZipFileAccess2]
      }
    }
    
    object ZipConstants {
      
      /* Rewritten from type alias, can be one of: 
        - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`9`
        - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`1`
        - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`36`
        - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`38`
        - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`32`
        - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`16`
        - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`14`
        - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`34`
        - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`30`
        - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`8`
        - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`46`
        - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`10`
        - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`24`
        - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`28`
        - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`42`
        - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`33639248`
        - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`20`
        - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`12`
        - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`4`
        - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`6`
        - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`-1`
        - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`0`
        - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`22`
        - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`101010256`
        - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`134695760`
        - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`2`
        - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`26`
        - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`67324752`
        - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`18`
      */
      trait Constants extends StObject
      object Constants {
        
        @scala.inline
        def BEST_COMPRESSION: `9` = 9.asInstanceOf[`9`]
        
        @scala.inline
        def BEST_SPEED: `1` = 1.asInstanceOf[`1`]
        
        @scala.inline
        def CENATT: `36` = 36.asInstanceOf[`36`]
        
        @scala.inline
        def CENATX: `38` = 38.asInstanceOf[`38`]
        
        @scala.inline
        def CENCOM: `32` = 32.asInstanceOf[`32`]
        
        @scala.inline
        def CENCRC: `16` = 16.asInstanceOf[`16`]
        
        @scala.inline
        def CENDAT: `14` = 14.asInstanceOf[`14`]
        
        @scala.inline
        def CENDSK: `34` = 34.asInstanceOf[`34`]
        
        @scala.inline
        def CENEXT: `30` = 30.asInstanceOf[`30`]
        
        @scala.inline
        def CENFLG: `8` = 8.asInstanceOf[`8`]
        
        @scala.inline
        def CENHDR: `46` = 46.asInstanceOf[`46`]
        
        @scala.inline
        def CENHOW: `10` = 10.asInstanceOf[`10`]
        
        @scala.inline
        def CENLEN: `24` = 24.asInstanceOf[`24`]
        
        @scala.inline
        def CENNAM: `28` = 28.asInstanceOf[`28`]
        
        @scala.inline
        def CENOFF: `42` = 42.asInstanceOf[`42`]
        
        @scala.inline
        def CENSIG: `33639248` = 33639248.asInstanceOf[`33639248`]
        
        @scala.inline
        def CENSIZ: `20` = 20.asInstanceOf[`20`]
        
        @scala.inline
        def CENTIM: `12` = 12.asInstanceOf[`12`]
        
        @scala.inline
        def CENVEM: `4` = 4.asInstanceOf[`4`]
        
        @scala.inline
        def CENVER: `6` = 6.asInstanceOf[`6`]
        
        @scala.inline
        def DEFAULT_COMPRESSION: `-1` = -1.asInstanceOf[`-1`]
        
        @scala.inline
        def DEFAULT_STRATEGY: `0` = 0.asInstanceOf[`0`]
        
        @scala.inline
        def DEFLATED: `8` = 8.asInstanceOf[`8`]
        
        @scala.inline
        def DEF_MEM_LEVEL: `8` = 8.asInstanceOf[`8`]
        
        @scala.inline
        def ENDCOM: `20` = 20.asInstanceOf[`20`]
        
        @scala.inline
        def ENDHDR: `22` = 22.asInstanceOf[`22`]
        
        @scala.inline
        def ENDOFF: `16` = 16.asInstanceOf[`16`]
        
        @scala.inline
        def ENDSIG: `101010256` = 101010256.asInstanceOf[`101010256`]
        
        @scala.inline
        def ENDSIZ: `12` = 12.asInstanceOf[`12`]
        
        @scala.inline
        def ENDSUB: `8` = 8.asInstanceOf[`8`]
        
        @scala.inline
        def ENDTOT: `10` = 10.asInstanceOf[`10`]
        
        @scala.inline
        def EXTCRC: `4` = 4.asInstanceOf[`4`]
        
        @scala.inline
        def EXTHDR: `16` = 16.asInstanceOf[`16`]
        
        @scala.inline
        def EXTLEN: `12` = 12.asInstanceOf[`12`]
        
        @scala.inline
        def EXTSIG: `134695760` = 134695760.asInstanceOf[`134695760`]
        
        @scala.inline
        def EXTSIZ: `8` = 8.asInstanceOf[`8`]
        
        @scala.inline
        def FILTERED: `1` = 1.asInstanceOf[`1`]
        
        @scala.inline
        def HUFFMAN_ONLY: `2` = 2.asInstanceOf[`2`]
        
        @scala.inline
        def LOCCRC: `14` = 14.asInstanceOf[`14`]
        
        @scala.inline
        def LOCEXT: `28` = 28.asInstanceOf[`28`]
        
        @scala.inline
        def LOCFLG: `6` = 6.asInstanceOf[`6`]
        
        @scala.inline
        def LOCHDR: `30` = 30.asInstanceOf[`30`]
        
        @scala.inline
        def LOCHOW: `8` = 8.asInstanceOf[`8`]
        
        @scala.inline
        def LOCLEN: `22` = 22.asInstanceOf[`22`]
        
        @scala.inline
        def LOCNAM: `26` = 26.asInstanceOf[`26`]
        
        @scala.inline
        def LOCSIG: `67324752` = 67324752.asInstanceOf[`67324752`]
        
        @scala.inline
        def LOCSIZ: `18` = 18.asInstanceOf[`18`]
        
        @scala.inline
        def LOCTIM: `10` = 10.asInstanceOf[`10`]
        
        @scala.inline
        def LOCVER: `4` = 4.asInstanceOf[`4`]
        
        @scala.inline
        def NO_COMPRESSION: `0` = 0.asInstanceOf[`0`]
        
        @scala.inline
        def SPANSIG: `134695760` = 134695760.asInstanceOf[`134695760`]
        
        @scala.inline
        def STORED: `0` = 0.asInstanceOf[`0`]
      }
    }
    
    /**
      * used to represent a ZIP file entry
      *
      * This interface is an IDL version of the Java interface **java.util.zip.ZipFile** with some minor adaptations.
      */
    @js.native
    trait ZipEntry extends StObject {
      
      /** optional extra field data for entry */
      var extra: SafeArray[Double] = js.native
      
      /** uncompressed size of entry data */
      var nCompressedSize: Double = js.native
      
      /** CRC-32 of entry data */
      var nCrc: Double = js.native
      
      /** The number of the disk this entry is saved on */
      var nDiskNumber: Double = js.native
      
      /** bit flags */
      var nFlag: Double = js.native
      
      /** compression method */
      var nMethod: Double = js.native
      
      /** offset of LOC header */
      var nOffset: Double = js.native
      
      /** uncompressed size of entry data */
      var nSize: Double = js.native
      
      /** modification time */
      var nTime: Double = js.native
      
      /** version needed to extract */
      var nVersion: Double = js.native
      
      /** optional comment */
      var sComment: String = js.native
      
      /** the entry name */
      var sName: String = js.native
    }
    object ZipEntry {
      
      @scala.inline
      def apply(
        extra: SafeArray[Double],
        nCompressedSize: Double,
        nCrc: Double,
        nDiskNumber: Double,
        nFlag: Double,
        nMethod: Double,
        nOffset: Double,
        nSize: Double,
        nTime: Double,
        nVersion: Double,
        sComment: String,
        sName: String
      ): ZipEntry = {
        val __obj = js.Dynamic.literal(extra = extra.asInstanceOf[js.Any], nCompressedSize = nCompressedSize.asInstanceOf[js.Any], nCrc = nCrc.asInstanceOf[js.Any], nDiskNumber = nDiskNumber.asInstanceOf[js.Any], nFlag = nFlag.asInstanceOf[js.Any], nMethod = nMethod.asInstanceOf[js.Any], nOffset = nOffset.asInstanceOf[js.Any], nSize = nSize.asInstanceOf[js.Any], nTime = nTime.asInstanceOf[js.Any], nVersion = nVersion.asInstanceOf[js.Any], sComment = sComment.asInstanceOf[js.Any], sName = sName.asInstanceOf[js.Any])
        __obj.asInstanceOf[ZipEntry]
      }
      
      @scala.inline
      implicit class ZipEntryMutableBuilder[Self <: ZipEntry] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setExtra(value: SafeArray[Double]): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNCompressedSize(value: Double): Self = StObject.set(x, "nCompressedSize", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNCrc(value: Double): Self = StObject.set(x, "nCrc", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNDiskNumber(value: Double): Self = StObject.set(x, "nDiskNumber", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNFlag(value: Double): Self = StObject.set(x, "nFlag", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNMethod(value: Double): Self = StObject.set(x, "nMethod", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNOffset(value: Double): Self = StObject.set(x, "nOffset", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNSize(value: Double): Self = StObject.set(x, "nSize", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNTime(value: Double): Self = StObject.set(x, "nTime", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNVersion(value: Double): Self = StObject.set(x, "nVersion", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSComment(value: String): Self = StObject.set(x, "sComment", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSName(value: String): Self = StObject.set(x, "sName", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * used to indicate that a ZIP exception has occurred.
      *
      * This interface is an IDL version of the Java interface **java.util.zip.ZipException** with some minor adaptations.
      */
    type ZipException = Exception
    
    /** allows to get reading access to non-encrypted entries inside zip file. */
    @js.native
    trait ZipFileAccess extends XZipFileAccess2 {
      
      def createWithURL(URL: String): Unit = js.native
    }
    object ZipFileAccess {
      
      @scala.inline
      def apply(
        ElementNames: SafeArray[String],
        ElementType: `type`,
        acquire: () => Unit,
        createWithURL: String => Unit,
        getByName: String => js.Any,
        getElementNames: () => SafeArray[String],
        getElementType: () => `type`,
        getStreamByPattern: String => XInputStream,
        hasByName: String => Boolean,
        hasElements: () => Boolean,
        queryInterface: `type` => js.Any,
        release: () => Unit
      ): ZipFileAccess = {
        val __obj = js.Dynamic.literal(ElementNames = ElementNames.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), createWithURL = js.Any.fromFunction1(createWithURL), getByName = js.Any.fromFunction1(getByName), getElementNames = js.Any.fromFunction0(getElementNames), getElementType = js.Any.fromFunction0(getElementType), getStreamByPattern = js.Any.fromFunction1(getStreamByPattern), hasByName = js.Any.fromFunction1(hasByName), hasElements = js.Any.fromFunction0(hasElements), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
        __obj.asInstanceOf[ZipFileAccess]
      }
      
      @scala.inline
      implicit class ZipFileAccessMutableBuilder[Self <: ZipFileAccess] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCreateWithURL(value: String => Unit): Self = StObject.set(x, "createWithURL", js.Any.fromFunction1(value))
      }
    }
    
    /**
      * used to indicate that a ZIP exception has occurred. Usually can be thrown from XInputStream interface implementations.
      *
      * This interface is an IDL version of the Java interface **java.util.zip.ZipException** with some minor adaptations.
      * @since OOo 1.1.2
      */
    type ZipIOException = IOException
  }
}
