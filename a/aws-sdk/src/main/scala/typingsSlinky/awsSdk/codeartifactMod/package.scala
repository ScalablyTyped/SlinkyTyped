package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object codeartifactMod {
  
  type AccountId = java.lang.String
  
  type Arn = java.lang.String
  
  type Asset = typingsSlinky.node.Buffer | js.typedarray.Uint8Array | typingsSlinky.awsSdk.codeartifactMod.Blob | java.lang.String | typingsSlinky.node.streamMod.Readable
  
  type AssetHashes = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.codeartifactMod.HashValue]
  
  type AssetName = java.lang.String
  
  type AssetSummaryList = js.Array[typingsSlinky.awsSdk.codeartifactMod.AssetSummary]
  
  type AuthorizationTokenDurationSeconds = scala.Double
  
  type BooleanOptional = scala.Boolean
  
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.codeartifactMod.ClientApiVersions
  
  type Description = java.lang.String
  
  type DomainName = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Active_
    - typingsSlinky.awsSdk.awsSdkStrings.Deleted_
    - java.lang.String
  */
  type DomainStatus = typingsSlinky.awsSdk.codeartifactMod._DomainStatus | java.lang.String
  
  type DomainSummaryList = js.Array[typingsSlinky.awsSdk.codeartifactMod.DomainSummary]
  
  type ErrorMessage = java.lang.String
  
  type ExternalConnectionName = java.lang.String
  
  type ExternalConnectionStatus = typingsSlinky.awsSdk.awsSdkStrings.Available_ | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.MD5
    - typingsSlinky.awsSdk.awsSdkStrings.`SHA-1`
    - typingsSlinky.awsSdk.awsSdkStrings.`SHA-256`
    - typingsSlinky.awsSdk.awsSdkStrings.`SHA-512`
    - java.lang.String
  */
  type HashAlgorithm = typingsSlinky.awsSdk.codeartifactMod._HashAlgorithm | java.lang.String
  
  type HashValue = java.lang.String
  
  type Integer = scala.Double
  
  type LicenseInfoList = js.Array[typingsSlinky.awsSdk.codeartifactMod.LicenseInfo]
  
  type ListDomainsMaxResults = scala.Double
  
  type ListPackageVersionAssetsMaxResults = scala.Double
  
  type ListPackageVersionsMaxResults = scala.Double
  
  type ListPackagesMaxResults = scala.Double
  
  type ListRepositoriesInDomainMaxResults = scala.Double
  
  type ListRepositoriesMaxResults = scala.Double
  
  type Long = scala.Double
  
  type LongOptional = scala.Double
  
  type PackageDependencyList = js.Array[typingsSlinky.awsSdk.codeartifactMod.PackageDependency]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.npm
    - typingsSlinky.awsSdk.awsSdkStrings.pypi
    - typingsSlinky.awsSdk.awsSdkStrings.maven
    - java.lang.String
  */
  type PackageFormat = typingsSlinky.awsSdk.codeartifactMod._PackageFormat | java.lang.String
  
  type PackageName = java.lang.String
  
  type PackageNamespace = java.lang.String
  
  type PackageSummaryList = js.Array[typingsSlinky.awsSdk.codeartifactMod.PackageSummary]
  
  type PackageVersion = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ALREADY_EXISTS
    - typingsSlinky.awsSdk.awsSdkStrings.MISMATCHED_REVISION
    - typingsSlinky.awsSdk.awsSdkStrings.MISMATCHED_STATUS
    - typingsSlinky.awsSdk.awsSdkStrings.NOT_ALLOWED
    - typingsSlinky.awsSdk.awsSdkStrings.NOT_FOUND
    - typingsSlinky.awsSdk.awsSdkStrings.SKIPPED
    - java.lang.String
  */
  type PackageVersionErrorCode = typingsSlinky.awsSdk.codeartifactMod._PackageVersionErrorCode | java.lang.String
  
  type PackageVersionErrorMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.codeartifactMod.PackageVersionError]
  
  type PackageVersionList = js.Array[typingsSlinky.awsSdk.codeartifactMod.PackageVersion]
  
  type PackageVersionRevision = java.lang.String
  
  type PackageVersionRevisionMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.codeartifactMod.PackageVersionRevision]
  
  type PackageVersionSortType = typingsSlinky.awsSdk.awsSdkStrings.PUBLISHED_TIME | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Published_
    - typingsSlinky.awsSdk.awsSdkStrings.Unfinished
    - typingsSlinky.awsSdk.awsSdkStrings.Unlisted
    - typingsSlinky.awsSdk.awsSdkStrings.Archived_
    - typingsSlinky.awsSdk.awsSdkStrings.Disposed
    - typingsSlinky.awsSdk.awsSdkStrings.Deleted_
    - java.lang.String
  */
  type PackageVersionStatus = typingsSlinky.awsSdk.codeartifactMod._PackageVersionStatus | java.lang.String
  
  type PackageVersionSummaryList = js.Array[typingsSlinky.awsSdk.codeartifactMod.PackageVersionSummary]
  
  type PaginationToken = java.lang.String
  
  type PolicyDocument = java.lang.String
  
  type PolicyRevision = java.lang.String
  
  type RepositoryExternalConnectionInfoList = js.Array[typingsSlinky.awsSdk.codeartifactMod.RepositoryExternalConnectionInfo]
  
  type RepositoryName = java.lang.String
  
  type RepositorySummaryList = js.Array[typingsSlinky.awsSdk.codeartifactMod.RepositorySummary]
  
  type String = java.lang.String
  
  type String255 = java.lang.String
  
  type SuccessfulPackageVersionInfoMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.codeartifactMod.SuccessfulPackageVersionInfo]
  
  type Timestamp = js.Date
  
  type UpstreamRepositoryInfoList = js.Array[typingsSlinky.awsSdk.codeartifactMod.UpstreamRepositoryInfo]
  
  type UpstreamRepositoryList = js.Array[typingsSlinky.awsSdk.codeartifactMod.UpstreamRepository]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2018-09-22`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.codeartifactMod._apiVersion | java.lang.String
}
