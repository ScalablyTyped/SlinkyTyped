package typingsSlinky.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchGameSessionsInput extends js.Object {
  
  /**
    * A unique identifier for an alias associated with the fleet to search for active game sessions. You can use either the alias ID or ARN value. Each request must reference either a fleet ID or alias ID, but not both.
    */
  var AliasId: js.UndefOr[AliasIdOrArn] = js.native
  
  /**
    * String containing the search criteria for the session search. If no filter expression is included, the request returns results for all game sessions in the fleet that are in ACTIVE status. A filter expression can contain one or multiple conditions. Each condition consists of the following:    Operand -- Name of a game session attribute. Valid values are gameSessionName, gameSessionId, gameSessionProperties, maximumSessions, creationTimeMillis, playerSessionCount, hasAvailablePlayerSessions.    Comparator -- Valid comparators are: =, &lt;&gt;, &lt;, &gt;, &lt;=, &gt;=.     Value -- Value to be searched for. Values may be numbers, boolean values (true/false) or strings depending on the operand. String values are case sensitive and must be enclosed in single quotes. Special characters must be escaped. Boolean and string values can only be used with the comparators = and &lt;&gt;. For example, the following filter expression searches on gameSessionName: "FilterExpression": "gameSessionName = 'Matt\\'s Awesome Game 1'".    To chain multiple conditions in a single expression, use the logical keywords AND, OR, and NOT and parentheses as needed. For example: x AND y AND NOT z, NOT (x OR y). Session search evaluates conditions from left to right using the following precedence rules:    =, &lt;&gt;, &lt;, &gt;, &lt;=, &gt;=    Parentheses   NOT   AND   OR   For example, this filter expression retrieves game sessions hosting at least ten players that have an open player slot: "maximumSessions&gt;=10 AND hasAvailablePlayerSessions=true". 
    */
  var FilterExpression: js.UndefOr[NonZeroAndMaxString] = js.native
  
  /**
    * A unique identifier for a fleet to search for active game sessions. You can use either the fleet ID or ARN value. Each request must reference either a fleet ID or alias ID, but not both.
    */
  var FleetId: js.UndefOr[FleetIdOrArn] = js.native
  
  /**
    * The maximum number of results to return. Use this parameter with NextToken to get results as a set of sequential pages. The maximum number of results returned is 20, even if this value is not set or is set higher than 20. 
    */
  var Limit: js.UndefOr[PositiveInteger] = js.native
  
  /**
    * Token that indicates the start of the next sequential page of results. Use the token that is returned with a previous call to this operation. To start at the beginning of the result set, do not specify a value.
    */
  var NextToken: js.UndefOr[NonZeroAndMaxString] = js.native
  
  /**
    * Instructions on how to sort the search results. If no sort expression is included, the request returns results in random order. A sort expression consists of the following elements:    Operand -- Name of a game session attribute. Valid values are gameSessionName, gameSessionId, gameSessionProperties, maximumSessions, creationTimeMillis, playerSessionCount, hasAvailablePlayerSessions.    Order -- Valid sort orders are ASC (ascending) and DESC (descending).   For example, this sort expression returns the oldest active sessions first: "SortExpression": "creationTimeMillis ASC". Results with a null value for the sort operand are returned at the end of the list.
    */
  var SortExpression: js.UndefOr[NonZeroAndMaxString] = js.native
}
object SearchGameSessionsInput {
  
  @scala.inline
  def apply(): SearchGameSessionsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchGameSessionsInput]
  }
  
  @scala.inline
  implicit class SearchGameSessionsInputOps[Self <: SearchGameSessionsInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAliasId(value: AliasIdOrArn): Self = this.set("AliasId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAliasId: Self = this.set("AliasId", js.undefined)
    
    @scala.inline
    def setFilterExpression(value: NonZeroAndMaxString): Self = this.set("FilterExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterExpression: Self = this.set("FilterExpression", js.undefined)
    
    @scala.inline
    def setFleetId(value: FleetIdOrArn): Self = this.set("FleetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFleetId: Self = this.set("FleetId", js.undefined)
    
    @scala.inline
    def setLimit(value: PositiveInteger): Self = this.set("Limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLimit: Self = this.set("Limit", js.undefined)
    
    @scala.inline
    def setNextToken(value: NonZeroAndMaxString): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setSortExpression(value: NonZeroAndMaxString): Self = this.set("SortExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortExpression: Self = this.set("SortExpression", js.undefined)
  }
}
