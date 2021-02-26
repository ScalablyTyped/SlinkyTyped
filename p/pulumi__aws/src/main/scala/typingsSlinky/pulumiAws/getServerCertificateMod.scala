package typingsSlinky.pulumiAws

import typingsSlinky.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getServerCertificateMod {
  
  @JSImport("@pulumi/aws/iam/getServerCertificate", "getServerCertificate")
  @js.native
  def getServerCertificate(): js.Promise[GetServerCertificateResult] = js.native
  @JSImport("@pulumi/aws/iam/getServerCertificate", "getServerCertificate")
  @js.native
  def getServerCertificate(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetServerCertificateResult] = js.native
  @JSImport("@pulumi/aws/iam/getServerCertificate", "getServerCertificate")
  @js.native
  def getServerCertificate(args: GetServerCertificateArgs): js.Promise[GetServerCertificateResult] = js.native
  @JSImport("@pulumi/aws/iam/getServerCertificate", "getServerCertificate")
  @js.native
  def getServerCertificate(args: GetServerCertificateArgs, opts: InvokeOptions): js.Promise[GetServerCertificateResult] = js.native
  
  @js.native
  trait GetServerCertificateArgs extends StObject {
    
    /**
      * sort results by expiration date. returns the certificate with expiration date in furthest in the future.
      */
    val latest: js.UndefOr[Boolean] = js.native
    
    /**
      * exact name of the cert to lookup
      */
    val name: js.UndefOr[String] = js.native
    
    /**
      * prefix of cert to filter by
      */
    val namePrefix: js.UndefOr[String] = js.native
    
    /**
      * prefix of path to filter by
      */
    val pathPrefix: js.UndefOr[String] = js.native
  }
  object GetServerCertificateArgs {
    
    @scala.inline
    def apply(): GetServerCertificateArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetServerCertificateArgs]
    }
    
    @scala.inline
    implicit class GetServerCertificateArgsMutableBuilder[Self <: GetServerCertificateArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLatest(value: Boolean): Self = StObject.set(x, "latest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLatestUndefined: Self = StObject.set(x, "latest", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamePrefix(value: String): Self = StObject.set(x, "namePrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamePrefixUndefined: Self = StObject.set(x, "namePrefix", js.undefined)
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setPathPrefix(value: String): Self = StObject.set(x, "pathPrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathPrefixUndefined: Self = StObject.set(x, "pathPrefix", js.undefined)
    }
  }
  
  @js.native
  trait GetServerCertificateResult extends StObject {
    
    val arn: String = js.native
    
    val certificateBody: String = js.native
    
    val certificateChain: String = js.native
    
    val expirationDate: String = js.native
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String = js.native
    
    val latest: js.UndefOr[Boolean] = js.native
    
    val name: String = js.native
    
    val namePrefix: js.UndefOr[String] = js.native
    
    val path: String = js.native
    
    val pathPrefix: js.UndefOr[String] = js.native
    
    val uploadDate: String = js.native
  }
  object GetServerCertificateResult {
    
    @scala.inline
    def apply(
      arn: String,
      certificateBody: String,
      certificateChain: String,
      expirationDate: String,
      id: String,
      name: String,
      path: String,
      uploadDate: String
    ): GetServerCertificateResult = {
      val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], certificateBody = certificateBody.asInstanceOf[js.Any], certificateChain = certificateChain.asInstanceOf[js.Any], expirationDate = expirationDate.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], uploadDate = uploadDate.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetServerCertificateResult]
    }
    
    @scala.inline
    implicit class GetServerCertificateResultMutableBuilder[Self <: GetServerCertificateResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCertificateBody(value: String): Self = StObject.set(x, "certificateBody", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCertificateChain(value: String): Self = StObject.set(x, "certificateChain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpirationDate(value: String): Self = StObject.set(x, "expirationDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLatest(value: Boolean): Self = StObject.set(x, "latest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLatestUndefined: Self = StObject.set(x, "latest", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamePrefix(value: String): Self = StObject.set(x, "namePrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamePrefixUndefined: Self = StObject.set(x, "namePrefix", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathPrefix(value: String): Self = StObject.set(x, "pathPrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathPrefixUndefined: Self = StObject.set(x, "pathPrefix", js.undefined)
      
      @scala.inline
      def setUploadDate(value: String): Self = StObject.set(x, "uploadDate", value.asInstanceOf[js.Any])
    }
  }
}
