organization := "org.scalablytyped.slinky"
name := "hapi__hawk"
version := "8.0-dt-20200122Z-f0ee86"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "caseless" % "0.12-dt-20200515Z-1a0aa4",
  "org.scalablytyped.slinky" %%% "crypto-js" % "v3.1.8-dt-20200515Z-2f0463",
  "org.scalablytyped.slinky" %%% "form-data" % "2.5.1-cb3aa6",
  "org.scalablytyped.slinky" %%% "hapi__boom" % "9.1.0-cb6024",
  "org.scalablytyped.slinky" %%% "hapi__catbox" % "10.2-dt-20190521Z-63f228",
  "org.scalablytyped.slinky" %%% "hapi__hapi" % "19.0-dt-20200515Z-af82c7",
  "org.scalablytyped.slinky" %%% "hapi__iron" % "6.0.0-48f0ca",
  "org.scalablytyped.slinky" %%% "hapi__joi" % "17.1-dt-20200505Z-fc5d6b",
  "org.scalablytyped.slinky" %%% "hapi__mimos" % "4.1-dt-20200424Z-d72697",
  "org.scalablytyped.slinky" %%% "hapi__podium" % "3.4-dt-20200515Z-328c12",
  "org.scalablytyped.slinky" %%% "hapi__shot" % "4.1-dt-20190404Z-a5fc9f",
  "org.scalablytyped.slinky" %%% "hapi__sntp" % "3.1-dt-20200515Z-09d929",
  "org.scalablytyped.slinky" %%% "mime-db" % "1.43-dt-20200424Z-0a8c94",
  "org.scalablytyped.slinky" %%% "node" % "14.0-dt-20200519Z-fa178d",
  "org.scalablytyped.slinky" %%% "request" % "2.48-dt-20200515Z-b47420",
  "org.scalablytyped.slinky" %%% "std" % "3.9-c21af0",
  "org.scalablytyped.slinky" %%% "tough-cookie" % "4.0-dt-20200515Z-6402f6")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
