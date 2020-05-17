package typingsSlinky.postmanCollection.mod

import typingsSlinky.postmanCollection.anon.Key
import typingsSlinky.postmanCollection.postmanCollectionStrings.apikey
import typingsSlinky.postmanCollection.postmanCollectionStrings.awsv4
import typingsSlinky.postmanCollection.postmanCollectionStrings.basic
import typingsSlinky.postmanCollection.postmanCollectionStrings.bearer
import typingsSlinky.postmanCollection.postmanCollectionStrings.digest
import typingsSlinky.postmanCollection.postmanCollectionStrings.edgegrid
import typingsSlinky.postmanCollection.postmanCollectionStrings.hawk
import typingsSlinky.postmanCollection.postmanCollectionStrings.noauth
import typingsSlinky.postmanCollection.postmanCollectionStrings.ntlm
import typingsSlinky.postmanCollection.postmanCollectionStrings.oauth1
import typingsSlinky.postmanCollection.postmanCollectionStrings.oauth2
import typingsSlinky.std.NonNullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.postmanCollection.mod.PropertyBaseDefinition because Already inherited
- typingsSlinky.postmanCollection.mod.PropertyDefinition because Already inherited
- typingsSlinky.postmanCollection.mod.RequestAuthDefinition because var conflicts: description, disabled, id, name. Inlined `type`, oauth2, hawk, basic, oauth1, apikey, digest, bearer, awsv4, edgegrid, ntlm */ @JSImport("postman-collection", "RequestAuth")
@js.native
class RequestAuth protected () extends Property[RequestAuthDefinition] {
  def this(options: RequestAuthDefinition) = this()
  def this(options: RequestAuthDefinition, parent: Property[PropertyDefinition]) = this()
  def this(options: RequestAuthDefinition, parent: PropertyList[RequestAuth]) = this()
  var apikey: js.UndefOr[js.Array[VariableDefinition]] = js.native
  var awsv4: js.UndefOr[js.Array[VariableDefinition]] = js.native
  var basic: js.UndefOr[js.Array[VariableDefinition]] = js.native
  var bearer: js.UndefOr[js.Array[VariableDefinition]] = js.native
  var digest: js.UndefOr[js.Array[VariableDefinition]] = js.native
  var edgegrid: js.UndefOr[js.Array[VariableDefinition]] = js.native
  var hawk: js.UndefOr[js.Array[VariableDefinition]] = js.native
  var ntlm: js.UndefOr[js.Array[VariableDefinition]] = js.native
  var oauth1: js.UndefOr[js.Array[VariableDefinition]] = js.native
  var oauth2: js.UndefOr[js.Array[VariableDefinition]] = js.native
  var `type`: js.UndefOr[
    (NonNullable[
      js.UndefOr[
        oauth2 | hawk | noauth | basic | oauth1 | apikey | digest | bearer | awsv4 | edgegrid | ntlm
      ]
    ]) | apikey | awsv4 | basic | bearer | digest | edgegrid | hawk | noauth | ntlm | oauth1 | oauth2
  ] = js.native
  def clear(`type`: String): Unit = js.native
  def current(): js.Any = js.native
  def parameters(): VariableList = js.native
  def update(options: js.Array[Key]): Unit = js.native
  def update(options: js.Array[Key], `type`: String): Unit = js.native
  def update(options: Key): Unit = js.native
  def update(options: Key, `type`: String): Unit = js.native
  def update(options: VariableList): Unit = js.native
  def update(options: VariableList, `type`: String): Unit = js.native
  def use(`type`: String, options: js.Array[Key]): Unit = js.native
  def use(`type`: String, options: Key): Unit = js.native
  def use(`type`: String, options: VariableList): Unit = js.native
}

/* static members */
@JSImport("postman-collection", "RequestAuth")
@js.native
object RequestAuth extends js.Object {
  def isValidType(`type`: js.Any): Boolean = js.native
}

