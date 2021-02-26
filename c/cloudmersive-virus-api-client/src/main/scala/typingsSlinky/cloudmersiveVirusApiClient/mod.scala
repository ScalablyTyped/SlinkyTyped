package typingsSlinky.cloudmersiveVirusApiClient

import typingsSlinky.cloudmersiveVirusApiClient.anon.Apikey
import typingsSlinky.cloudmersiveVirusApiClient.cloudmersiveVirusApiClientStrings.apiKey_
import typingsSlinky.cloudmersiveVirusApiClient.cloudmersiveVirusApiClientStrings.header
import typingsSlinky.node.Buffer
import typingsSlinky.node.httpMod.Agent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @js.native
  trait ApiClient extends StObject {
    
    var CollectionFormatEnum: typingsSlinky.cloudmersiveVirusApiClient.mod.CollectionFormatEnum = js.native
    
    /**
      * Constructs a new map or array model from REST data.
      * @param data any - The REST data.
      * @param obj any - The target object or array.
      */
    def constructFromObject(data: js.Any, obj: js.Any, itemType: js.Any): Unit = js.native
    
    /**
      * Converts a value to the specified type.
      * @param data string | Object - The data to convert, as a string or object.
      * @param type any - The type to return.
      * Pass a string for simple types or the constructor function for a complex type. Pass an
      * array containing the type name to return an array of that type. To return an object, pass
      * an object with one property whose name is the key type and whose value is the corresponding
      *  value type: all properties on <code>data<code> will be converted to this type.
      * @returns An instance of the specified type or null or undefined if data is null or undefined.
      */
    def convertToType(data: String, `type`: js.Any): js.Any = js.native
    def convertToType(data: js.Object, `type`: js.Any): js.Any = js.native
    
    var instance: ApiInstance = js.native
    
    /**
      * Parses an ISO-8601 string representation of a date value.
      * @param str string - The date value as a string.
      * @returns Date - The parsed date object.
      */
    def parseDate(str: String): js.Date = js.native
  }
  @JSImport("cloudmersive-virus-api-client", "ApiClient")
  @js.native
  val ApiClient: typingsSlinky.cloudmersiveVirusApiClient.mod.ApiClient = js.native
  
  @js.native
  sealed trait CollectionFormatEnum extends StObject
  @JSImport("cloudmersive-virus-api-client", "CollectionFormatEnum")
  @js.native
  object CollectionFormatEnum extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[CollectionFormatEnum with String] = js.native
    
    /**
      * Comma-separated values. Value: <code>csv</code>
      */
    @js.native
    sealed trait CSV extends CollectionFormatEnum
    /* "," */ val CSV: typingsSlinky.cloudmersiveVirusApiClient.mod.CollectionFormatEnum.CSV with String = js.native
    
    /**
      * Native array. Value: <code>multi</code>
      */
    @js.native
    sealed trait MULTI extends CollectionFormatEnum
    /* "multi" */ val MULTI: typingsSlinky.cloudmersiveVirusApiClient.mod.CollectionFormatEnum.MULTI with String = js.native
    
    /**
      * Pipe(|)-separated values. Value: <code>pipes</code>
      */
    @js.native
    sealed trait PIPES extends CollectionFormatEnum
    /* "|" */ val PIPES: typingsSlinky.cloudmersiveVirusApiClient.mod.CollectionFormatEnum.PIPES with String = js.native
    
    /**
      * Space-separated values. Value: <code>ssv</code>
      */
    @js.native
    sealed trait SSV extends CollectionFormatEnum
    /* " " */ val SSV: typingsSlinky.cloudmersiveVirusApiClient.mod.CollectionFormatEnum.SSV with String = js.native
    
    /**
      * Tab-separated values. Value: <code>tsv</code>
      */
    @js.native
    sealed trait TSV extends CollectionFormatEnum
    /* "\t" */ val TSV: typingsSlinky.cloudmersiveVirusApiClient.mod.CollectionFormatEnum.TSV with String = js.native
  }
  
  @JSImport("cloudmersive-virus-api-client", "ScanApi")
  @js.native
  class ScanApi () extends StObject {
    def this(apiClient: typingsSlinky.cloudmersiveVirusApiClient.mod.ApiClient) = this()
    
    /**
      * Scan a file for viruses
      * Scan files and content for viruses.
      * Leverage continuously updated signatures for millions of threats, and advanced
      * high-performance scanning capabilities.  Over 17 million virus and malware signatures.
      * Continuous cloud-based updates.  Wide file format support including Office, PDF, HTML, Flash.
      * Zip support including .Zip, .Rar, .DMG, .Tar, and other archive formats.
      * Multi-threat scanning across viruses, malware, trojans, ransomware, and spyware.
      * High-speed in-memory scanning delivers subsecond typical response time.
      * @param inputFile buffer - Input file to perform the operation on.
      * @param callback function - The callback function, accepting three arguments:
      * error, data, response
      */
    def scanFile(
      inputFile: Buffer,
      callback: js.Function3[/* error */ js.Any, /* data */ VirusScanResult, /* response */ js.Any, _]
    ): js.Any = js.native
    
    /**
      * Advanced Scan a file for viruses
      * Advanced Scan files with 360-degree Content Protection across Viruses and Malware,
      * executables, invalid files, scripts, and even restrictions on accepted file types
      * with complete content verification. Customize threat rules to your needs.
      * Leverage continuously updated signatures for millions of threats,
      * and advanced high-performance scanning capabilities.
      * Over 17 million virus and malware signatures.
      * Continuous cloud-based updates.
      * Block threats beyond viruses including executables, scripts, invalid files, and more.
      * Optionally limit input files to a specific set of file types(eg PDF and Word Documents only).
      *  Wide file format support including Office, PDF, HTML, Flash.
      * Zip support including .Zip, .Rar, .DMG, .Tar, and other archive formats.
      * Multi-threat scanning across viruses, malware, trojans, ransomware, and spyware.
      * High-speed in-memory scanning delivers subsecond typical response time.
      * @param inputFile buffer - Input file to perform the operation on.
      * @param opts object - Optional parameters
      * @param opts.allowExecutables boolean - Set to false to block executable files (program code)
      * from being allowed in the input file.  Default is false (recommended).
      * @param opts.allowInvalidFiles boolean - Set to false to block invalid files, such as a
      * PDF file that is not really a valid PDF file, or a Word Document that is not a
      * valid Word Document.
      * Default is false (recommended).
      * @param opts.allowScripts boolean - Set to false to block script files, such as a
      * PHP files, Python scripts, and other malicious content or security threats that
      * can be embedded in the file.
      * Set to true to allow these file types.  Default is false (recommended).
      * @param opts.restrictFileTypes boolean - Specify a restricted set of file formats to
      * allow as clean as a comma-separated list of file formats, such as .pdf,.docx,.png
      * would allow only PDF, PNG and Word document files.  All files must pass content
      * verification against this list of file formats, if they do not, then the result
      * will be returned as CleanResult&#x3D;false. Set restrictFileTypes parameter to null or
      * empty string to disable; default is disabled.
      * @param callback function - The callback function, accepting three arguments:
      * error, data, response
      */
    def scanFileAdvanced(
      inputFile: Buffer,
      opts: ScanFileAdvancedOptions,
      callback: js.Function3[/* error */ js.Any, /* data */ VirusScanAdvancedResult, /* response */ js.Any, _]
    ): js.Any = js.native
    /**
      * Advanced Scan a file for viruses
      * Advanced Scan files with 360-degree Content Protection across Viruses and Malware,
      * executables, invalid files, scripts, and even restrictions on accepted file types
      * with complete content verification. Customize threat rules to your needs.
      * Leverage continuously updated signatures for millions of threats,
      * and advanced high-performance scanning capabilities.
      * Over 17 million virus and malware signatures.
      * Continuous cloud-based updates.
      * Block threats beyond viruses including executables, scripts, invalid files, and more.
      * Optionally limit input files to a specific set of file types(eg PDF and Word Documents only).
      *  Wide file format support including Office, PDF, HTML, Flash.
      * Zip support including .Zip, .Rar, .DMG, .Tar, and other archive formats.
      * Multi-threat scanning across viruses, malware, trojans, ransomware, and spyware.
      * High-speed in-memory scanning delivers subsecond typical response time.
      * @param inputFile buffer - Input file to perform the operation on.
      * @param opts object - Optional parameters
      * @param opts.allowExecutables boolean - Set to false to block executable files (program code)
      * from being allowed in the input file.  Default is false (recommended).
      * @param opts.allowInvalidFiles boolean - Set to false to block invalid files, such as a
      * PDF file that is not really a valid PDF file, or a Word Document that is not a
      * valid Word Document.
      * Default is false (recommended).
      * @param opts.allowScripts boolean - Set to false to block script files, such as a
      * PHP files, Python scripts, and other malicious content or security threats that
      * can be embedded in the file.
      * Set to true to allow these file types.  Default is false (recommended).
      * @param opts.restrictFileTypes boolean - Specify a restricted set of file formats to
      * allow as clean as a comma-separated list of file formats, such as .pdf,.docx,.png
      * would allow only PDF, PNG and Word document files.  All files must pass content
      * verification against this list of file formats, if they do not, then the result
      * will be returned as CleanResult&#x3D;false. Set restrictFileTypes parameter to null or
      * empty string to disable; default is disabled.
      * @param callback function - The callback function, accepting three arguments:
      * error, data, response
      */
    @JSName("scanFileAdvanced")
    var scanFileAdvanced_Original: ScanFileAdvanced = js.native
    
    /**
      * Scan a file for viruses
      * Scan files and content for viruses.
      * Leverage continuously updated signatures for millions of threats, and advanced
      * high-performance scanning capabilities.  Over 17 million virus and malware signatures.
      * Continuous cloud-based updates.  Wide file format support including Office, PDF, HTML, Flash.
      * Zip support including .Zip, .Rar, .DMG, .Tar, and other archive formats.
      * Multi-threat scanning across viruses, malware, trojans, ransomware, and spyware.
      * High-speed in-memory scanning delivers subsecond typical response time.
      * @param inputFile buffer - Input file to perform the operation on.
      * @param callback function - The callback function, accepting three arguments:
      * error, data, response
      */
    @JSName("scanFile")
    var scanFile_Original: ScanFile = js.native
    
    /**
      * Scan a website for malicious content and threats
      * Operation includes scanning the content of the URL for various types
      * of malicious content and threats, including viruses and threats (including Phishing).
      * @param input string - URL of the website to scan; should begin with http:// or https://
      * @param callback function - The callback function, accepting three arguments:
      * error, data, response
      */
    def scanWebsite(
      input: WebsiteScanRequest,
      callback: js.Function3[/* error */ js.Any, /* data */ WebsiteScanResult, /* response */ js.Any, _]
    ): js.Any = js.native
    /**
      * Scan a website for malicious content and threats
      * Operation includes scanning the content of the URL for various types
      * of malicious content and threats, including viruses and threats (including Phishing).
      * @param input string - URL of the website to scan; should begin with http:// or https://
      * @param callback function - The callback function, accepting three arguments:
      * error, data, response
      */
    @JSName("scanWebsite")
    var scanWebsite_Original: ScanWebsite = js.native
  }
  
  @js.native
  trait VirusFound extends StObject {
    
    /**
      * @param FileName string
      * Name of the file containing the virus
      */
    var FileName: String = js.native
    
    /**
      * @param VirusName string
      * Name of the virus that was found
      */
    var VirusName: String = js.native
  }
  object VirusFound {
    
    @JSImport("cloudmersive-virus-api-client", "VirusFound")
    @js.native
    val ^ : VirusFound = js.native
    
    @scala.inline
    implicit class VirusFoundMutableBuilder[Self <: VirusFound] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFileName(value: String): Self = StObject.set(x, "FileName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVirusName(value: String): Self = StObject.set(x, "VirusName", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait VirusScanAdvancedResult extends VirusScanResult {
    
    /**
      * @param ContainsExecutable boolean
      * True if the scan contained an executable (application code),
      * which can be a significant risk factor
      */
    var ContainsExecutable: Boolean = js.native
    
    /**
      * @param ContainsInvalidFile boolean
      * True if the scan contained an invalid file (such as a PDF that is not a valid PDF,
      * Word Document that is not a valid Word Document, etc.), which can be a significant risk facto
      */
    var ContainsInvalidFile: Boolean = js.native
    
    /**
      * @param ContainsRestrictedFileFormat boolean
      * True if the uploaded file is of a type that is not allowed based on the optional
      * restrictFileTypes parameter, false otherwise;
      * if restrictFileTypes is not set, this will always be false
      */
    var ContainsRestrictedFileFormat: Boolean = js.native
    
    /**
      * @param ContainsScript boolean
      * True if the scan contained a script (such as a PHP script, Python script, etc.) which can
      * be a significant risk factor
      */
    var ContainsScript: Boolean = js.native
    
    /**
      * @param VerifiedFileFormat string
      * For file format verification-supported file formats, the contents-verified file format
      *  of the file. Null indicates that the file format is not supported for contents verification.
      *  If a Virus or Malware is found, this field will always be set to Null.
      */
    var VerifiedFileFormat: String = js.native
  }
  object VirusScanAdvancedResult {
    
    @JSImport("cloudmersive-virus-api-client", "VirusScanAdvancedResult")
    @js.native
    val ^ : VirusScanAdvancedResult = js.native
    
    @scala.inline
    implicit class VirusScanAdvancedResultMutableBuilder[Self <: VirusScanAdvancedResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContainsExecutable(value: Boolean): Self = StObject.set(x, "ContainsExecutable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainsInvalidFile(value: Boolean): Self = StObject.set(x, "ContainsInvalidFile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainsRestrictedFileFormat(value: Boolean): Self = StObject.set(x, "ContainsRestrictedFileFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainsScript(value: Boolean): Self = StObject.set(x, "ContainsScript", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerifiedFileFormat(value: String): Self = StObject.set(x, "VerifiedFileFormat", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait VirusScanResult extends StObject {
    
    /**
      * @param CleanResult boolean
      * True if the scan contained no viruses, false otherwise
      */
    var CleanResult: Boolean = js.native
    
    /**
      * @param FoundViruses null | IVirusFound
      * Array of viruses found, if any
      */
    var FoundViruses: Null | js.Array[VirusFound] = js.native
  }
  object VirusScanResult {
    
    @JSImport("cloudmersive-virus-api-client", "VirusScanResult")
    @js.native
    val ^ : VirusScanResult = js.native
    
    @scala.inline
    implicit class VirusScanResultMutableBuilder[Self <: VirusScanResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCleanResult(value: Boolean): Self = StObject.set(x, "CleanResult", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFoundViruses(value: js.Array[VirusFound]): Self = StObject.set(x, "FoundViruses", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFoundVirusesNull: Self = StObject.set(x, "FoundViruses", null)
      
      @scala.inline
      def setFoundVirusesVarargs(value: VirusFound*): Self = StObject.set(x, "FoundViruses", js.Array(value :_*))
    }
  }
  
  @js.native
  trait WebsiteScanRequest extends StObject {
    
    /**
      * @param Url string
      * URL of the website to scan; should begin with http:// or https://
      */
    var Url: String = js.native
  }
  object WebsiteScanRequest {
    
    @JSImport("cloudmersive-virus-api-client", "WebsiteScanRequest")
    @js.native
    val ^ : WebsiteScanRequest = js.native
    
    @scala.inline
    implicit class WebsiteScanRequestMutableBuilder[Self <: WebsiteScanRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "Url", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait WebsiteScanResult extends VirusScanResult {
    
    /**
      * @param WebsiteHttpResponseCode number (int32)
      * The remote server URL HTTP reasponse code; useful for debugging issues with scanning;
      * typically if the remote server returns a 200 or 300-series code this means a successful
      * response, while a 400 or 500 series code would represent an error returned from the
      * remote server for the provided URL.
      */
    var WebsiteHttpResponseCode: Double = js.native
    
    /**
      * @param WebsiteThreatType None, Malware, Phishing, ForcedDownload, UnableToConnect
      * Type of threat returned; can be None, Malware, ForcedDownload or Phishing
      */
    var WebsiteThreatType: typingsSlinky.cloudmersiveVirusApiClient.mod.WebsiteThreatType = js.native
  }
  object WebsiteScanResult {
    
    @JSImport("cloudmersive-virus-api-client", "WebsiteScanResult")
    @js.native
    val ^ : WebsiteScanResult = js.native
    
    @scala.inline
    implicit class WebsiteScanResultMutableBuilder[Self <: WebsiteScanResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setWebsiteHttpResponseCode(value: Double): Self = StObject.set(x, "WebsiteHttpResponseCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebsiteThreatType(value: WebsiteThreatType): Self = StObject.set(x, "WebsiteThreatType", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  sealed trait WebsiteThreatType extends StObject
  @JSImport("cloudmersive-virus-api-client", "WebsiteThreatType")
  @js.native
  object WebsiteThreatType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[WebsiteThreatType with String] = js.native
    
    @js.native
    sealed trait ForcedDownload extends WebsiteThreatType
    /* "ForcedDownload" */ val ForcedDownload: typingsSlinky.cloudmersiveVirusApiClient.mod.WebsiteThreatType.ForcedDownload with String = js.native
    
    @js.native
    sealed trait Malware extends WebsiteThreatType
    /* "Malware" */ val Malware: typingsSlinky.cloudmersiveVirusApiClient.mod.WebsiteThreatType.Malware with String = js.native
    
    @js.native
    sealed trait None extends WebsiteThreatType
    /* "None" */ val None: typingsSlinky.cloudmersiveVirusApiClient.mod.WebsiteThreatType.None with String = js.native
    
    @js.native
    sealed trait Phising extends WebsiteThreatType
    /* "Phishing" */ val Phising: typingsSlinky.cloudmersiveVirusApiClient.mod.WebsiteThreatType.Phising with String = js.native
    
    @js.native
    sealed trait UnableToConnect extends WebsiteThreatType
    /* "UnableToConnect" */ val UnableToConnect: typingsSlinky.cloudmersiveVirusApiClient.mod.WebsiteThreatType.UnableToConnect with String = js.native
  }
  
  @js.native
  trait ApiInstance extends StObject {
    
    /**
      * @param agent http.Agent - Used to save and return cookies in a node.js (
      * non-browser) setting, if this.enableCookies is set to true.
      */
    var agent: Agent = js.native
    
    /**
      * @param authentications object - The authentication methods to be included for all API calls.
      */
    var authentications: Apikey = js.native
    
    /**
      * @param basePath string - The base URL against which to resolve every API
      * call's (relative) path.
      * default https://api.cloudmersive.com
      */
    var basePath: String = js.native
    
    /**
      * If set to false an additional timestamp parameter is added to all API GET calls to
      * prevent browser caching
      * @param cache boolean - If set to false an additional timestamp parameter is added to
      * all API GET calls to prevent browser caching
      * default true
      */
    var cache: Boolean = js.native
    
    /**
      * @param defaultHeaders string[] - The default HTTP headers to be included for all API calls.
      * default {}
      */
    var defaultHeaders: js.Array[String] = js.native
    
    /**
      * @param enableCookies boolean - If set to true, the client will save the cookies
      * from each server response, and return them in the next request.
      * default false
      */
    var enableCookies: Boolean = js.native
    
    /**
      * @param requestAgent null | http.Agent - Allow user to override superagent agent
      */
    var requestAgent: Null | Agent = js.native
    
    /**
      * @param timeout number - The default HTTP timeout for all API calls.
      * default 60000
      */
    var timeout: Double = js.native
  }
  object ApiInstance {
    
    @scala.inline
    def apply(
      agent: Agent,
      authentications: Apikey,
      basePath: String,
      cache: Boolean,
      defaultHeaders: js.Array[String],
      enableCookies: Boolean,
      timeout: Double
    ): ApiInstance = {
      val __obj = js.Dynamic.literal(agent = agent.asInstanceOf[js.Any], authentications = authentications.asInstanceOf[js.Any], basePath = basePath.asInstanceOf[js.Any], cache = cache.asInstanceOf[js.Any], defaultHeaders = defaultHeaders.asInstanceOf[js.Any], enableCookies = enableCookies.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
      __obj.asInstanceOf[ApiInstance]
    }
    
    @scala.inline
    implicit class ApiInstanceMutableBuilder[Self <: ApiInstance] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAgent(value: Agent): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthentications(value: Apikey): Self = StObject.set(x, "authentications", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBasePath(value: String): Self = StObject.set(x, "basePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCache(value: Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultHeaders(value: js.Array[String]): Self = StObject.set(x, "defaultHeaders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultHeadersVarargs(value: String*): Self = StObject.set(x, "defaultHeaders", js.Array(value :_*))
      
      @scala.inline
      def setEnableCookies(value: Boolean): Self = StObject.set(x, "enableCookies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestAgent(value: Agent): Self = StObject.set(x, "requestAgent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestAgentNull: Self = StObject.set(x, "requestAgent", null)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ApiInstanceAuthentications extends StObject {
    
    var apiKey: String = js.native
    
    var in: header = js.native
    
    var name: typingsSlinky.cloudmersiveVirusApiClient.cloudmersiveVirusApiClientStrings.Apikey = js.native
    
    var `type`: apiKey_ = js.native
  }
  object ApiInstanceAuthentications {
    
    @scala.inline
    def apply(
      apiKey: String,
      in: header,
      name: typingsSlinky.cloudmersiveVirusApiClient.cloudmersiveVirusApiClientStrings.Apikey,
      `type`: apiKey_
    ): ApiInstanceAuthentications = {
      val __obj = js.Dynamic.literal(apiKey = apiKey.asInstanceOf[js.Any], in = in.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ApiInstanceAuthentications]
    }
    
    @scala.inline
    implicit class ApiInstanceAuthenticationsMutableBuilder[Self <: ApiInstanceAuthentications] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiKey(value: String): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIn(value: header): Self = StObject.set(x, "in", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: typingsSlinky.cloudmersiveVirusApiClient.cloudmersiveVirusApiClientStrings.Apikey): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: apiKey_): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type ScanFile = js.Function2[
    /* inputFile */ Buffer, 
    /* callback */ js.Function3[/* error */ js.Any, /* data */ VirusScanResult, /* response */ js.Any, js.Any], 
    js.Any
  ]
  
  type ScanFileAdvanced = js.Function3[
    /* inputFile */ Buffer, 
    /* opts */ ScanFileAdvancedOptions, 
    /* callback */ js.Function3[/* error */ js.Any, /* data */ VirusScanAdvancedResult, /* response */ js.Any, js.Any], 
    js.Any
  ]
  
  @js.native
  trait ScanFileAdvancedOptions extends StObject {
    
    /**
      * @param allowExecutables boolean
      * Set to false to block executable files (program code) from being allowed in the input file.
      * Default is false (recommended).
      */
    var allowExecutables: Boolean = js.native
    
    /**
      * @param allowInvalidFiles boolean
      * Set to false to block invalid files, such as a PDF file that is not really a valid PDF file,
      * or a Word Document that is not a valid Word Document.
      * Default is false (recommended).
      */
    var allowInvalidFiles: Boolean = js.native
    
    /**
      * @param allowScripts boolean
      * Set to false to block script files, such as a PHP files, Pythong scripts, and other malicious
      * content or security threats that can be embedded in the file. Set to true to allow these
      * file types.
      * Default is false (recommended).
      */
    var allowScripts: Boolean = js.native
    
    /**
      * @param restrictFileTypes string
      * Specify a restricted set of file formats to allow as clean as a comma-separated list of
      * file formats, such as .pdf,.docx,.png would allow only PDF, PNG and Word document files.
      *  All files must pass content verification against this list of file formats, if they do
      * not, then the result will be returned as CleanResult=false.
      * Set restrictFileTypes parameter to null or empty string to disable;
      * default is disabled.
      */
    var restrictFileTypes: String = js.native
  }
  object ScanFileAdvancedOptions {
    
    @scala.inline
    def apply(
      allowExecutables: Boolean,
      allowInvalidFiles: Boolean,
      allowScripts: Boolean,
      restrictFileTypes: String
    ): ScanFileAdvancedOptions = {
      val __obj = js.Dynamic.literal(allowExecutables = allowExecutables.asInstanceOf[js.Any], allowInvalidFiles = allowInvalidFiles.asInstanceOf[js.Any], allowScripts = allowScripts.asInstanceOf[js.Any], restrictFileTypes = restrictFileTypes.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScanFileAdvancedOptions]
    }
    
    @scala.inline
    implicit class ScanFileAdvancedOptionsMutableBuilder[Self <: ScanFileAdvancedOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowExecutables(value: Boolean): Self = StObject.set(x, "allowExecutables", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowInvalidFiles(value: Boolean): Self = StObject.set(x, "allowInvalidFiles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowScripts(value: Boolean): Self = StObject.set(x, "allowScripts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRestrictFileTypes(value: String): Self = StObject.set(x, "restrictFileTypes", value.asInstanceOf[js.Any])
    }
  }
  
  type ScanWebsite = js.Function2[
    /* input */ WebsiteScanRequest, 
    /* callback */ js.Function3[/* error */ js.Any, /* data */ WebsiteScanResult, /* response */ js.Any, js.Any], 
    js.Any
  ]
}
