package typingsSlinky.evaporate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object evaporateMod {
  import typingsSlinky.evaporate.evaporateStrings.abortCompletionThrottlingMs
  import typingsSlinky.evaporate.evaporateStrings.allowS3ExistenceOptimization
  import typingsSlinky.evaporate.evaporateStrings.awsRegion
  import typingsSlinky.evaporate.evaporateStrings.awsSignatureVersion
  import typingsSlinky.evaporate.evaporateStrings.aws_key
  import typingsSlinky.evaporate.evaporateStrings.aws_url
  import typingsSlinky.evaporate.evaporateStrings.bucket
  import typingsSlinky.evaporate.evaporateStrings.cloudfront
  import typingsSlinky.evaporate.evaporateStrings.computeContentMd5
  import typingsSlinky.evaporate.evaporateStrings.cryptoHexEncodedHash256
  import typingsSlinky.evaporate.evaporateStrings.cryptoMd5Method
  import typingsSlinky.evaporate.evaporateStrings.customAuthMethod
  import typingsSlinky.evaporate.evaporateStrings.encodeFilename
  import typingsSlinky.evaporate.evaporateStrings.localTimeOffset
  import typingsSlinky.evaporate.evaporateStrings.logging
  import typingsSlinky.evaporate.evaporateStrings.maxConcurrentParts
  import typingsSlinky.evaporate.evaporateStrings.maxFileSize
  import typingsSlinky.evaporate.evaporateStrings.maxRetryBackoffSecs
  import typingsSlinky.evaporate.evaporateStrings.mockLocalStorage
  import typingsSlinky.evaporate.evaporateStrings.onlyRetryForSameFileName
  import typingsSlinky.evaporate.evaporateStrings.partSize
  import typingsSlinky.evaporate.evaporateStrings.progressIntervalMS
  import typingsSlinky.evaporate.evaporateStrings.readableStreamPartMethod
  import typingsSlinky.evaporate.evaporateStrings.readableStreams
  import typingsSlinky.evaporate.evaporateStrings.retryBackoffPower
  import typingsSlinky.evaporate.evaporateStrings.s3Acceleration
  import typingsSlinky.evaporate.evaporateStrings.s3FileCacheHoursAgo
  import typingsSlinky.evaporate.evaporateStrings.sendCanonicalRequestToSignerUrl
  import typingsSlinky.evaporate.evaporateStrings.signHeaders
  import typingsSlinky.evaporate.evaporateStrings.signParams
  import typingsSlinky.evaporate.evaporateStrings.signResponseHandler
  import typingsSlinky.evaporate.evaporateStrings.signerUrl
  import typingsSlinky.evaporate.evaporateStrings.timeUrl
  import typingsSlinky.evaporate.evaporateStrings.xhrWithCredentials
  import typingsSlinky.std.Exclude
  import typingsSlinky.std.Pick

  type AddOverrideOptionKeys = Exclude[
    readableStreams | readableStreamPartMethod | bucket | logging | maxConcurrentParts | partSize | retryBackoffPower | maxRetryBackoffSecs | progressIntervalMS | cloudfront | s3Acceleration | mockLocalStorage | encodeFilename | computeContentMd5 | allowS3ExistenceOptimization | onlyRetryForSameFileName | timeUrl | cryptoMd5Method | cryptoHexEncodedHash256 | aws_url | aws_key | awsRegion | awsSignatureVersion | signerUrl | sendCanonicalRequestToSignerUrl | s3FileCacheHoursAgo | signParams | signHeaders | customAuthMethod | maxFileSize | signResponseHandler | xhrWithCredentials | localTimeOffset | abortCompletionThrottlingMs, 
    ImmutableOptionKeys
  ]
  type AddOverrideOptions = Pick[CreateConfig, AddOverrideOptionKeys]
}
