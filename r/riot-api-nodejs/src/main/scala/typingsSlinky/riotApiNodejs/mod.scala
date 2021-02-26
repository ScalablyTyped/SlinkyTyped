package typingsSlinky.riotApiNodejs

import typingsSlinky.riotGamesApi.RiotGamesAPI.Champion.ChampionDto
import typingsSlinky.riotGamesApi.RiotGamesAPI.Champion.ChampionListDto
import typingsSlinky.riotGamesApi.RiotGamesAPI.ChampionMastery.ChampionMasteryDto
import typingsSlinky.riotGamesApi.RiotGamesAPI.CurrentGame.CurrentGameInfo
import typingsSlinky.riotGamesApi.RiotGamesAPI.FeaturedGames.FeaturedGames
import typingsSlinky.riotGamesApi.RiotGamesAPI.Game.RecentGamesDto
import typingsSlinky.riotGamesApi.RiotGamesAPI.League.LeagueDto
import typingsSlinky.riotGamesApi.RiotGamesAPI.LolStaticData.ItemDto
import typingsSlinky.riotGamesApi.RiotGamesAPI.LolStaticData.ItemListDto
import typingsSlinky.riotGamesApi.RiotGamesAPI.LolStaticData.LanguageStringsDto
import typingsSlinky.riotGamesApi.RiotGamesAPI.LolStaticData.MapDataDto
import typingsSlinky.riotGamesApi.RiotGamesAPI.LolStaticData.MasteryDto
import typingsSlinky.riotGamesApi.RiotGamesAPI.LolStaticData.MasteryListDto
import typingsSlinky.riotGamesApi.RiotGamesAPI.LolStaticData.RealmDto
import typingsSlinky.riotGamesApi.RiotGamesAPI.LolStaticData.RuneDto
import typingsSlinky.riotGamesApi.RiotGamesAPI.LolStaticData.RuneListDto
import typingsSlinky.riotGamesApi.RiotGamesAPI.LolStaticData.SummonerSpellDto
import typingsSlinky.riotGamesApi.RiotGamesAPI.LolStaticData.SummonerSpellListDto
import typingsSlinky.riotGamesApi.RiotGamesAPI.LolStatus.Shard
import typingsSlinky.riotGamesApi.RiotGamesAPI.Match.MatchDetail
import typingsSlinky.riotGamesApi.RiotGamesAPI.MatchList.MatchList
import typingsSlinky.riotGamesApi.RiotGamesAPI.Stats.PlayerStatsSummaryListDto
import typingsSlinky.riotGamesApi.RiotGamesAPI.Stats.RankedStatsDto
import typingsSlinky.riotGamesApi.RiotGamesAPI.Summoner.MasteryPagesDto
import typingsSlinky.riotGamesApi.RiotGamesAPI.Summoner.RunePagesDto
import typingsSlinky.riotGamesApi.RiotGamesAPI.Summoner.SummonerDto
import typingsSlinky.riotGamesApi.RiotGamesAPI.Team.TeamDto
import typingsSlinky.riotGamesApi.RiotGamesAPI.TournamentProvider.LobbyEventDto
import typingsSlinky.riotGamesApi.RiotGamesAPI.TournamentProvider.TournamentCodeDto
import typingsSlinky.riotGamesApi.RiotGamesAPI.TournamentProvider.TournamentCodeParameters
import typingsSlinky.riotGamesApi.RiotGamesAPI.TournamentProvider.TournamentCodeUpdateParameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("riot-api-nodejs", "API")
  @js.native
  class API protected () extends StObject {
    def this(ApiKeys: js.Array[String]) = this()
    
    var ApiKey: js.Any = js.native
    
    var ApiKeys: js.Any = js.native
    
    /**
      * get the API Key that is used for the requests
      * @return    {string}    the current API Key
      */
    def getCurrentApiKey(): String = js.native
    
    /**
      * Send a request to the Riot Games Api and return a formatted json via a callback
      * @param     {string}    url         request url
      * @param     {string}    method      method(post / put / get)
      * @param     {[type]}    data        body parameters
      * @param     {(JSON}     callback    callback function with formatted JSON
      */
    def getJSON(url: String, method: String, data: js.Any): js.Promise[_] = js.native
    
    def request(url: String, method: String, data: js.Any): js.Promise[_] = js.native
    def request(url: String, method: String, data: js.Any, prop: String): js.Promise[_] = js.native
    
    /**
      * set the API Keys
      * @param    {string[]}    ApiKeys    the API Keys
      */
    def setApikeys(ApiKeys: js.Array[String]): Unit = js.native
    
    /**
      * Change the Api Key for the next requests
      */
    /* private */ def switchApiKey(): js.Any = js.native
  }
  
  @JSImport("riot-api-nodejs", "BASE_URL")
  @js.native
  val BASE_URL: String = js.native
  
  @JSImport("riot-api-nodejs", "ClassicAPI")
  @js.native
  class ClassicAPI protected () extends API {
    /**
      * ClassicAPI Constructor
      * @param     {string[]}    ApiKeys    API Keys for the requests
      * @param     {region_e}    region     region where you want to send requests
      */
    def this(ApiKeys: js.Array[String], region: regionE) = this()
    
    /**
      * get Challengers Teams in 3x3
      * @param     {RiotGamesAPI.League.LeagueDto}    callback    data callback
      */
    def getChallengers_3x3(): js.Promise[LeagueDto] = js.native
    
    /**
      * get Challengers Teams in 5x5
      * @param     {RiotGamesAPI.League.LeagueDto}    callback    data callback
      */
    def getChallengers_5x5(): js.Promise[LeagueDto] = js.native
    
    /**
      * get Challengers in SOLO Queue
      * @param     {RiotGamesAPI.League.LeagueDto}    callback    data callback
      */
    def getChallengers_SOLO(): js.Promise[LeagueDto] = js.native
    
    /**
      * get the champion for a given id
      * @param     {number}                               id          the champion id
      * @param     {RiotGamesAPI.Champion.ChampionDto}    callback    data callback
      */
    def getChampionById(id: Double): js.Promise[ChampionDto] = js.native
    
    /**
      * get Champion mastery of a player for a given champion ID
      * @param     {number}                                             summonerId    summoner ID
      * @param     {number}                                             championId    Champion ID
      * @param     {RiotGamesAPI.ChampionMastery.ChampionMasteryDto}    callback      data callback
      */
    def getChampionMastery(summonerId: Double, championId: Double): js.Promise[ChampionMasteryDto] = js.native
    
    /**
      * get all champion masteries for a given summoner
      * @param     {number}                                               summonerId    Summoner ID
      * @param     {[RiotGamesAPI.ChampionMastery.ChampionMasteryDto]}    callback      data callback
      */
    def getChampionMasteryBySummoner(summonerId: Double): js.Promise[js.Array[ChampionMasteryDto]] = js.native
    
    /**
      * get the mastery score of a summoner
      * @param     {number}    summonerId    Summoner ID
      * @param     {number}    callback      Mastery Score
      */
    def getChampionMasteryScore(summonerId: Double): js.Promise[Double] = js.native
    
    /**
      * get all champions of league of legends
      * @param     {RiotGamesAPI.Champion.ChampionListDto}    callback    data callback
      */
    def getChampions(): js.Promise[ChampionListDto] = js.native
    
    /**
      * get the current game infos for a given summoner ID
      * @param     {number}                                      summonerId    Summoner ID
      * @param     {RiotGamesAPI.CurrentGame.CurrentGameInfo}    callback      data callback
      */
    def getCurrentGame(summonerId: Double): js.Promise[CurrentGameInfo] = js.native
    
    /**
      * get the featured games
      * @param     {RiotGamesAPI.FeaturedGames.FeaturedGames}    callback    data callback
      */
    def getFeaturedGame(): js.Promise[FeaturedGames] = js.native
    
    /**
      * get the free to play champions
      * @param     {RiotGamesAPI.Champion.ChampionListDto}    callback    data callback
      */
    def getFreeToPlayChampions(): js.Promise[ChampionListDto] = js.native
    
    /**
      * Get League infos of a summoner
      * @param     {number}                             summonerId    Summoner ID
      * @param     {RiotGamesAPI.League.LeagueDto[]}    callback      data callback
      */
    def getLeagueBySummonerId(summonerId: Double): js.Promise[js.Array[LeagueDto]] = js.native
    
    /**
      * get League infos of a summoner
      * @param     {number}                             summonerId    Summoner ID
      * @param     {RiotGamesAPI.League.LeagueDto[]}    callback      data callback
      */
    def getLeagueBySummonerIdEntry(summonerId: Double): js.Promise[js.Array[LeagueDto]] = js.native
    
    /**
      * get league infos by team
      * @param     {string}                             teamId      Team ID
      * @param     {RiotGamesAPI.League.LeagueDto[]}    callback    data callback
      */
    def getLeagueByTeamId(teamId: String): js.Promise[js.Array[LeagueDto]] = js.native
    
    /**
      * get league infos by team
      * @param     {string}                             teamId      Team ID
      * @param     {RiotGamesAPI.League.LeagueDto[]}    callback    data callback
      */
    def getLeagueByTeamIdEntry(teamId: String): js.Promise[js.Array[LeagueDto]] = js.native
    
    /**
      * get Master Teams in 3x3
      * @param     {RiotGamesAPI.League.LeagueDto}    callback    data callback
      */
    def getMasters_3x3(): js.Promise[LeagueDto] = js.native
    
    /**
      * get Master Teams in 5x5
      * @param     {RiotGamesAPI.League.LeagueDto}    callback    data callback
      */
    def getMasters_5x5(): js.Promise[LeagueDto] = js.native
    
    /**
      * get Masters in Solo Queue
      * @param     {RiotGamesAPI.League.LeagueDto}    callback    data callback
      */
    def getMasters_SOLO(): js.Promise[LeagueDto] = js.native
    
    /**
      * get match infos for a given match ID
      * @param     {number}                            matchId     Match ID
      * @param     {RiotGamesAPI.Match.MatchDetail}    callback    data callback
      */
    def getMatch(matchId: Double): js.Promise[MatchDetail] = js.native
    
    /**
      * get match by ID in a tournament
      * @param     {number}                            matchId     Match ID
      * @param     {RiotGamesAPI.Match.MatchDetail}    callback    data callback
      */
    def getMatchForTournament(matchId: Double): js.Promise[MatchDetail] = js.native
    
    /**
      * get all matches for a given tournament code
      * @param     {string}      tournamentCode    Tournament Code
      * @param     {number[]}    callback          data callback
      */
    def getMatchIdsByTournamentCode(tournamentCode: String): js.Promise[js.Array[Double]] = js.native
    
    /**
      * get match list of a summoner
      * @param     {number}                              summonerId    Summoner ID
      * @param     {RiotGamesAPI.MatchList.MatchList}    callback      data callback
      */
    def getMatchList(summonerId: Double): js.Promise[MatchList] = js.native
    
    /**
      * get the recents games for a given Summoner ID
      * @param     {number}                              summonerId    Summoner ID
      * @param     {RiotGamesAPI.Game.RecentGamesDto}    callback      data callback
      */
    def getRecentGames(summonerId: Double): js.Promise[RecentGamesDto] = js.native
    
    /**
      * get the region where send send request
      * @return    {region_e}    the current region
      */
    def getRegion(): regionE = js.native
    
    /**
      * get ranked stats of summoner
      * @param     {number}                               summonerId    Summoner ID
      * @param     {RiotGamesAPI.Stats.RankedStatsDto}    callback      data callback
      */
    def getStatsRanked(summonerId: Double): js.Promise[RankedStatsDto] = js.native
    
    /**
      * get summary ranked stats of summoner
      * @param     {number}                                          summonerId    Summoner ID
      * @param     {RiotGamesAPI.Stats.PlayerStatsSummaryListDto}    callback      data callback
      */
    def getStatsSummary(summonerId: Double): js.Promise[PlayerStatsSummaryListDto] = js.native
    
    /**
      * get league of legends status
      * @param     {RiotGamesAPI.LolStatus.Shard[]}    callback    data callback
      */
    def getStatus(): js.Promise[js.Array[Shard]] = js.native
    
    /**
      * get status for a given region
      * @param     {region_e}                        region      region
      * @param     {RiotGamesAPI.LolStatus.Shard}    callback    data callback
      */
    def getStatusByRegion(region: regionE): js.Promise[Shard] = js.native
    
    /**
      * get summoner infos by summoner ID
      * @param     {number}                               summonerId    Summoner ID
      * @param     {RiotGamesAPI.Summoner.SummonerDto}    callback      data callback
      */
    def getSummonerById(summonerId: Double): js.Promise[SummonerDto] = js.native
    
    /**
      * get summoner infos by Summoner Name
      * @param     {string}                               summonerName    Summoner Name
      * @param     {RiotGamesAPI.Summoner.SummonerDto}    callback        data callback
      */
    def getSummonerByName(summonerName: String): js.Promise[SummonerDto] = js.native
    
    /**
      * get masteries of a summoner
      * @param     {number}                                   summonerId    Summoner ID
      * @param     {RiotGamesAPI.Summoner.MasteryPagesDto}    callback      data callback
      */
    def getSummonerMasteries(summonerId: Double): js.Promise[MasteryPagesDto] = js.native
    
    /**
      * get the Summoner Name of a summoner ID
      * @param     {number}    summonerId    Summoner ID
      * @param     {string}    callback      data callback
      */
    def getSummonerName(summonerId: Double): js.Promise[String] = js.native
    
    /**
      * get the runes of a summoner
      * @param     {number}                                summonerId    Summoner ID
      * @param     {RiotGamesAPI.Summoner.RunePagesDto}    callback      data callback
      */
    def getSummonerRunes(summonerId: Double): js.Promise[RunePagesDto] = js.native
    
    /**
      * get Team infos by Team ID
      * @param     {string}                       teamId      Team ID
      * @param     {RiotGamesAPI.Team.TeamDto}    callback    data callback
      */
    def getTeamById(teamId: String): js.Promise[TeamDto] = js.native
    
    /**
      * get teams of a summoner
      * @param     {number}                         summonerId    Summoner ID
      * @param     {RiotGamesAPI.Team.TeamDto[]}    callback      data callback
      */
    def getTeamsBySummoner(summonerId: Double): js.Promise[js.Array[TeamDto]] = js.native
    
    /**
      * get The 3 best champion masteries
      * @param     {[type]}                                               summonerId    Summoner ID
      * @param     {[RiotGamesAPI.ChampionMastery.ChampionMasteryDto]}    callback      data callback
      */
    def getTopChampionMastery(summonerId: js.Any): js.Promise[js.Array[ChampionMasteryDto]] = js.native
    
    /**
      * Edit the consts for a valid url for the riot games api
      * @param     {string}    unparsedURL    the URL to parse
      * @return    {string}                   the Parsed URL
      */
    def parseURL(unparsedURL: String): String = js.native
    
    var region: js.Any = js.native
    
    /**
      * set the region where you want to send requests
      * @param    {region_e}    region    the region
      */
    def setRegion(region: regionE): Unit = js.native
    
    /**
      * get data by champion ID
      * @param     {number}                                    championsId    Champion ID
      * @param     {RiotGamesAPI.LolStaticData.ChampionDto}    callback       data callback
      */
    def staticDataChampionById(championsId: Double): js.Promise[typingsSlinky.riotGamesApi.RiotGamesAPI.LolStaticData.ChampionDto] = js.native
    
    /**
      * get Champions (static data)
      * @param     {RiotGamesAPI.LolStaticData.ChampionListDto}    callback    data callback
      */
    def staticDataChampions(): js.Promise[typingsSlinky.riotGamesApi.RiotGamesAPI.LolStaticData.ChampionListDto] = js.native
    
    /**
      * Get item infos by ID
      * @param     {number}                                itemId      item ID
      * @param     {RiotGamesAPI.LolStaticData.ItemDto}    callback    data callback
      */
    def staticDataItemById(itemId: Double): js.Promise[ItemDto] = js.native
    
    /**
      * get League of Legends Items
      * @param     {RiotGamesAPI.LolStaticData.ItemListDto}    callback    data callback
      */
    def staticDataItems(): js.Promise[ItemListDto] = js.native
    
    /**
      * get league of legends languages
      * @param     {string[]}    callback    data callback
      */
    def staticDataLanguages(): js.Promise[js.Array[String]] = js.native
    
    /**
      * get league of legends languages
      * @param     {RiotGamesAPI.LolStaticData.LanguageStringsDto}    callback    data callback
      */
    def staticDataLanguagesStrings(): js.Promise[LanguageStringsDto] = js.native
    
    /**
      * get Map data
      * @param     {RiotGamesAPI.LolStaticData.MapDataDto}    callback    data callback
      */
    def staticDataMap(): js.Promise[MapDataDto] = js.native
    
    /**
      * get all masteries
      * @param     {RiotGamesAPI.LolStaticData.MasteryListDto}    callback    data callback
      */
    def staticDataMastery(): js.Promise[MasteryListDto] = js.native
    
    /**
      * get data by mastery ID
      * @param     {number}                                   masteryId    Mastery ID
      * @param     {RiotGamesAPI.LolStaticData.MasteryDto}    callback     data callback
      */
    def staticDataMasteryById(masteryId: Double): js.Promise[MasteryDto] = js.native
    
    def staticDataRealm(): js.Promise[RealmDto] = js.native
    
    /**
      * get rune by Rune ID
      * @param     {number}                                runeId      Rune ID
      * @param     {RiotGamesAPI.LolStaticData.RuneDto}    callback    data callback
      */
    def staticDataRuneById(runeId: Double): js.Promise[RuneDto] = js.native
    
    /**
      * get all runes
      * @param     {RiotGamesAPI.LolStaticData.RuneListDto}    callback    data callback
      */
    def staticDataRunes(): js.Promise[RuneListDto] = js.native
    
    /**
      * get summoner spell by summoner spell ID
      * @param     {number}                                         summonerSpellId    Summoner spell ID
      * @param     {RiotGamesAPI.LolStaticData.SummonerSpellDto}    callback           data callback
      */
    def staticDataSummonSpellById(summonerSpellId: Double): js.Promise[SummonerSpellDto] = js.native
    
    /**
      * get all summoner spells
      * @param     {RiotGamesAPI.LolStaticData.SummonerSpellListDto}    callback    data callback
      */
    def staticDataSummonerSpells(): js.Promise[SummonerSpellListDto] = js.native
    
    /**
      * get league of legends  versions
      * @param     {string[]}    callback    data callback
      */
    def staticDataVersion(): js.Promise[js.Array[String]] = js.native
  }
  
  @JSImport("riot-api-nodejs", "TournamentAPI")
  @js.native
  class TournamentAPI protected () extends API {
    def this(apiKeys: String*) = this()
    
    /**
      * create tournament Codes for a given tournament
      * @param     {number}                                                      tournamentId    the ID of the tournament
      * @param     {number}                                                      count           Number of codes you want
      * @param     {RiotGamesAPI.TournamentProvider.TournamentCodeParameters}    params          Tournament Code parameters
      * @param     {number[]}                                                    callback        Tournaments Codes                                                                    [description]
      */
    def createTournamentCodes(tournamentId: Double, count: Double, params: TournamentCodeParameters): js.Promise[js.Array[Double]] = js.native
    
    /**
      * edit the tournament Code parameters for a given tournament Code
      * @param     {string}                                                            tournamentCode    Tournament Code to update
      * @param     {RiotGamesAPI.TournamentProvider.TournamentCodeUpdateParameters}    params            parameters to edit
      * @param     {(}                                                                 callback          callback if succes
      */
    def editTournamentByCode(tournamentCode: String, params: TournamentCodeUpdateParameters): js.Promise[js.Function0[Unit]] = js.native
    
    /**
      * get the lobby envents for a given tournament Code
      * @param     {string}                                           tournamentCode    the tournament code to get the lobby events
      * @param     {RiotGamesAPI.TournamentProvider.LobbyEventDto}    callback          lobby events
      */
    def getLobbyEventByCode(tournamentCode: String): js.Promise[LobbyEventDto] = js.native
    
    /**
      * get tournament infos for a given tournament code
      * @param     {string}                                               tournamentCode    Tournament Code
      * @param     {RiotGamesAPI.TournamentProvider.TournamentCodeDto}    callback          Tournament Infos
      */
    def getTournamentByCode(tournamentCode: String): js.Promise[TournamentCodeDto] = js.native
    
    /**
      * Register a new tournament provider
      * @param     {region_e}    region      region where you want to register the provider
      * @param     {string}      url         url of callback for the POST notifications
      * @param     {number}      callback    returns  the tounament provider ID
      */
    def registerProvider(region: regionE, url: String): js.Promise[Double] = js.native
    
    /**
      * Register a new tournament
      * @param     {string}    name          Name of tournament
      * @param     {number}    providerId    Provider ID
      * @param     {number}    callback      returns the tournament ID
      */
    def registerTournament(name: String, providerId: Double): js.Promise[Double] = js.native
  }
  
  @JSImport("riot-api-nodejs", "URL_1_2")
  @js.native
  val URL_1_2: String = js.native
  
  @JSImport("riot-api-nodejs", "URL_1_3")
  @js.native
  val URL_1_3: String = js.native
  
  @JSImport("riot-api-nodejs", "URL_1_4")
  @js.native
  val URL_1_4: String = js.native
  
  @JSImport("riot-api-nodejs", "URL_2_2")
  @js.native
  val URL_2_2: String = js.native
  
  @JSImport("riot-api-nodejs", "URL_2_4")
  @js.native
  val URL_2_4: String = js.native
  
  @JSImport("riot-api-nodejs", "URL_2_5")
  @js.native
  val URL_2_5: String = js.native
  
  @js.native
  sealed trait regionE extends StObject
  @JSImport("riot-api-nodejs", "region_e")
  @js.native
  object regionE extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[regionE with Double] = js.native
    
    @js.native
    sealed trait BR extends regionE
    /* 0 */ val BR: typingsSlinky.riotApiNodejs.mod.regionE.BR with Double = js.native
    
    @js.native
    sealed trait EUNE extends regionE
    /* 1 */ val EUNE: typingsSlinky.riotApiNodejs.mod.regionE.EUNE with Double = js.native
    
    @js.native
    sealed trait EUW extends regionE
    /* 2 */ val EUW: typingsSlinky.riotApiNodejs.mod.regionE.EUW with Double = js.native
    
    @js.native
    sealed trait KR extends regionE
    /* 3 */ val KR: typingsSlinky.riotApiNodejs.mod.regionE.KR with Double = js.native
    
    @js.native
    sealed trait LAN extends regionE
    /* 4 */ val LAN: typingsSlinky.riotApiNodejs.mod.regionE.LAN with Double = js.native
    
    @js.native
    sealed trait LAS extends regionE
    /* 5 */ val LAS: typingsSlinky.riotApiNodejs.mod.regionE.LAS with Double = js.native
    
    @js.native
    sealed trait NA extends regionE
    /* 6 */ val NA: typingsSlinky.riotApiNodejs.mod.regionE.NA with Double = js.native
    
    @js.native
    sealed trait OCE extends regionE
    /* 7 */ val OCE: typingsSlinky.riotApiNodejs.mod.regionE.OCE with Double = js.native
    
    @js.native
    sealed trait PBE extends regionE
    /* 10 */ val PBE: typingsSlinky.riotApiNodejs.mod.regionE.PBE with Double = js.native
    
    @js.native
    sealed trait RU extends regionE
    /* 9 */ val RU: typingsSlinky.riotApiNodejs.mod.regionE.RU with Double = js.native
    
    @js.native
    sealed trait TR extends regionE
    /* 8 */ val TR: typingsSlinky.riotApiNodejs.mod.regionE.TR with Double = js.native
  }
}
