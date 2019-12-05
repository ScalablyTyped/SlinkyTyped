organization := "org.scalablytyped.slinky"
name := "hapi__bell"
version := "11.0-dt-20190916Z-a4041d"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "hapi__boom" % "7.4-dt-20190815Z-d8a58c",
  "org.scalablytyped.slinky" %%% "hapi__catbox" % "10.2-dt-20190521Z-869366",
  "org.scalablytyped.slinky" %%% "hapi__hapi" % "18.2-dt-20191105Z-4e3166",
  "org.scalablytyped.slinky" %%% "hapi__iron" % "5.1-dt-20190404Z-66f690",
  "org.scalablytyped.slinky" %%% "hapi__joi" % "16.0-dt-20191104Z-d350bc",
  "org.scalablytyped.slinky" %%% "hapi__mimos" % "4.1-dt-20190404Z-79e7cb",
  "org.scalablytyped.slinky" %%% "hapi__podium" % "3.4-dt-20190404Z-2879cb",
  "org.scalablytyped.slinky" %%% "hapi__shot" % "4.1-dt-20190404Z-496bf3",
  "org.scalablytyped.slinky" %%% "mime-db" % "1.27-dt-20190322Z-7b6e37",
  "org.scalablytyped.slinky" %%% "node" % "12.12-dt-20191126Z-6a8cbf",
  "org.scalablytyped.slinky" %%% "std" % "3.7-cc3821")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        