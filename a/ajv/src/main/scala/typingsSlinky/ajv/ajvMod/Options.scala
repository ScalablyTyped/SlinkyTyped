package typingsSlinky.ajv.ajvMod

import typingsSlinky.ajv.ajvBooleans.`false`
import typingsSlinky.ajv.ajvBooleans.`true`
import typingsSlinky.ajv.ajvStrings.$id
import typingsSlinky.ajv.ajvStrings.all
import typingsSlinky.ajv.ajvStrings.array
import typingsSlinky.ajv.ajvStrings.auto
import typingsSlinky.ajv.ajvStrings.empty
import typingsSlinky.ajv.ajvStrings.fail
import typingsSlinky.ajv.ajvStrings.failing
import typingsSlinky.ajv.ajvStrings.id
import typingsSlinky.ajv.ajvStrings.ignore
import typingsSlinky.ajv.ajvStrings.log
import typingsSlinky.ajv.ajvStrings.shared
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  @JSName("$data")
  var $data: js.UndefOr[Boolean] = js.native
  var addUsedSchema: js.UndefOr[Boolean] = js.native
  var allErrors: js.UndefOr[Boolean] = js.native
  var async: js.UndefOr[Boolean | String] = js.native
  var cache: js.UndefOr[js.Object] = js.native
  var coerceTypes: js.UndefOr[Boolean | array] = js.native
  var errorDataPath: js.UndefOr[String] = js.native
  var extendRefs: js.UndefOr[`true` | ignore | fail] = js.native
  var format: js.UndefOr[String] = js.native
  var formats: js.UndefOr[js.Object] = js.native
  var inlineRefs: js.UndefOr[Boolean | Double] = js.native
  var jsonPointers: js.UndefOr[Boolean] = js.native
  var loadSchema: js.UndefOr[
    js.Function2[
      /* uri */ String, 
      /* cb */ js.UndefOr[js.Function2[/* err */ js.Error, /* schema */ js.Object, Unit]], 
      js.Thenable[js.Object | Boolean]
    ]
  ] = js.native
  var logger: js.UndefOr[CustomLogger | `false`] = js.native
  var loopRequired: js.UndefOr[Double] = js.native
  var messages: js.UndefOr[Boolean] = js.native
  var meta: js.UndefOr[Boolean | js.Object] = js.native
  var missingRefs: js.UndefOr[`true` | ignore | fail] = js.native
  var multipleOfPrecision: js.UndefOr[Boolean | Double] = js.native
  var nullable: js.UndefOr[Boolean] = js.native
  var ownProperties: js.UndefOr[Boolean] = js.native
  var passContext: js.UndefOr[Boolean] = js.native
  var processCode: js.UndefOr[js.Function1[/* code */ String, String]] = js.native
  var removeAdditional: js.UndefOr[Boolean | all | failing] = js.native
  var schemaId: js.UndefOr[$id | id | auto] = js.native
  var schemas: js.UndefOr[js.Array[js.Object] | js.Object] = js.native
  var serialize: js.UndefOr[(js.Function1[/* schema */ js.Object | Boolean, _]) | `false`] = js.native
  var sourceCode: js.UndefOr[Boolean] = js.native
  var strictDefaults: js.UndefOr[Boolean | log] = js.native
  var strictKeywords: js.UndefOr[Boolean | log] = js.native
  var transpile: js.UndefOr[String | (js.Function1[/* code */ String, String])] = js.native
  var unicode: js.UndefOr[Boolean] = js.native
  var uniqueItems: js.UndefOr[Boolean] = js.native
  var unknownFormats: js.UndefOr[`true` | js.Array[String] | ignore] = js.native
  var useDefaults: js.UndefOr[Boolean | empty | shared] = js.native
  var validateSchema: js.UndefOr[Boolean | log] = js.native
  var verbose: js.UndefOr[Boolean] = js.native
}

