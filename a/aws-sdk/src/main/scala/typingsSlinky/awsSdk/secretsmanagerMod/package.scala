package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object secretsmanagerMod {
  type AutomaticallyRotateAfterDaysType = scala.Double
  type BooleanType = scala.Boolean
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.secretsmanagerMod.ClientApiVersions
  type ClientRequestTokenType = java.lang.String
  type CreatedDateType = js.Date
  type DeletedDateType = js.Date
  type DeletionDateType = js.Date
  type DescriptionType = java.lang.String
  type ExcludeCharactersType = java.lang.String
  type ExcludeLowercaseType = scala.Boolean
  type ExcludeNumbersType = scala.Boolean
  type ExcludePunctuationType = scala.Boolean
  type ExcludeUppercaseType = scala.Boolean
  type IncludeSpaceType = scala.Boolean
  type KmsKeyIdType = java.lang.String
  type LastAccessedDateType = js.Date
  type LastChangedDateType = js.Date
  type LastRotatedDateType = js.Date
  type MaxResultsType = scala.Double
  type NameType = java.lang.String
  type NextTokenType = java.lang.String
  type NonEmptyResourcePolicyType = java.lang.String
  type OwningServiceType = java.lang.String
  type PasswordLengthType = scala.Double
  type RandomPasswordType = java.lang.String
  type RecoveryWindowInDaysType = scala.Double
  type RequireEachIncludedTypeType = scala.Boolean
  type RotationEnabledType = scala.Boolean
  type RotationLambdaARNType = java.lang.String
  type SecretARNType = java.lang.String
  type SecretBinaryType = typingsSlinky.node.Buffer | scala.scalajs.js.typedarray.Uint8Array | typingsSlinky.awsSdk.secretsmanagerMod.Blob | java.lang.String
  type SecretIdType = java.lang.String
  type SecretListType = js.Array[typingsSlinky.awsSdk.secretsmanagerMod.SecretListEntry]
  type SecretNameType = java.lang.String
  type SecretStringType = java.lang.String
  type SecretVersionIdType = java.lang.String
  type SecretVersionStageType = java.lang.String
  type SecretVersionStagesType = js.Array[typingsSlinky.awsSdk.secretsmanagerMod.SecretVersionStageType]
  type SecretVersionsListType = js.Array[typingsSlinky.awsSdk.secretsmanagerMod.SecretVersionsListEntry]
  type SecretVersionsToStagesMapType = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.secretsmanagerMod.SecretVersionStagesType]
  type TagKeyListType = js.Array[typingsSlinky.awsSdk.secretsmanagerMod.TagKeyType]
  type TagKeyType = java.lang.String
  type TagListType = js.Array[typingsSlinky.awsSdk.secretsmanagerMod.Tag]
  type TagValueType = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2017-10-17`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.secretsmanagerMod._apiVersion | java.lang.String
}
