organization := "org.scalablytyped.slinky"
name := "sanitize-html"
version := "1.23.0-dt-20200630Z-bcc9dc"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "dom-serializer" % "0.2.2-4d80d3",
  "org.scalablytyped.slinky" %%% "domelementtype" % "2.0.1-8e01b5",
  "org.scalablytyped.slinky" %%% "domutils" % "2.1.0-26ca0f",
  "org.scalablytyped.slinky" %%% "htmlparser2" % "4.1.0-937b65",
  "org.scalablytyped.slinky" %%% "node" % "14.0-dt-20200724Z-df8c17",
  "org.scalablytyped.slinky" %%% "std" % "3.9-88d6d8")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
